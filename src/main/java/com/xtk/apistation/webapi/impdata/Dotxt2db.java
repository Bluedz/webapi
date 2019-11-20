package com.xtk.apistation.webapi.impdata;

import com.xtk.apistation.webapi.bean.LogOfImport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.Properties;

public class Dotxt2db<main> {
    // def log
    private  Logger logger = LoggerFactory.getLogger(this.getClass());

    // init
    private static String[] folderList = {
            "MatAccounts", "MatFactoryAttr", "MatInfor", "MatPurchasingStatus", "MatRequestResult"
    }; //  MatFactoryAttr
    public  static String root ;
    public  static String bakRoot ;
    static {
        InputStream in;
        Properties pt = new Properties();
        try {
            in = Dotxt2db.class.getClassLoader().getResourceAsStream("localKey.properties");
            pt.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //    private  static String root = "D:\\test\\";
        //    private  static String bakRoot = "D:\\ExchangeBak\\";
        root = pt.getProperty("root");
        bakRoot = pt.getProperty("bakRoot");
    }

    // 去掉空白字符函数
    private String delSpaceChar( String str){
        return str.trim();
    }
    private String fillLastSpace( String str) {
        // String str = "1@";
        if ((str.lastIndexOf("@") + 1) == str.length()){
            str = str + " ";    }
        return str;
    }

    private void doIt(String folder) throws Exception{

        String folderName = folder;
        String path = root + folderName;
        List<String> fileList;
        List<String> linesOfFile;

        fileList = GetFileList.getFiles(path); // get file list in one folder
        for(String fileName:fileList) { // get each file in file list
            linesOfFile = GetEveryLinesOfTxt.getLineTxt(fileName);
            for(String lineTxt:linesOfFile) { // get each line of file
                String originalLineTxt = lineTxt;
                // clear line
                lineTxt = new Dotxt2db().delSpaceChar(lineTxt);
                lineTxt = new Dotxt2db().fillLastSpace(lineTxt);
                String[] str = lineTxt.split("@");
                String lineNum = str[0];
                String lineCont = lineTxt.substring(lineTxt.indexOf("@") + 1);
//                 String lineCont = lineTxt.substring(lineTxt.indexOf("@")*2 + 1 + 1); //为满足错误txt
                System.out.println("\n" + fileName);
                System.out.println(
                        folderName + " " + lineNum + " : " + lineCont
                );

                // do 写一行入数据库中一条记录
                boolean flag;
                TryWrDB tryWrDB = new TryWrDB();
                flag =  tryWrDB.insertRecord(lineCont, folderName);

                //build log obj, 并写入记录，log输出结果
                LogOfImport loi = new LogOfImport();
                loi.setNameOfTxtfile( fileName );
                loi.setNameOfInterface( folderName );
                loi.setNumberOfLine(new BigDecimal(lineNum));
                loi.setContentOfOneline(originalLineTxt);  // lineCont
                loi.setResultOfImport( flag + " " );
                loi.setErrorMessage(tryWrDB.errorMeg);
                this.logger.info( "ImpR:---  " +
                        new ImpRecord().insertRecord(loi)
                );

                // log 输出结果
                this.logger.info("Result : " + flag);
                this.logger.error("ErrorMeg : " + tryWrDB.errorMeg);
            }
            //move file to bak folder
            moveTotherFolders(fileName, bakRoot  + folderName);
        }
        /*
        //move file to bak folder
       for(String fileName:fileList) {
            moveTotherFolders(fileName, bakRoot  + folderName);
        }*/

    }

    private void moveTotherFolders(String fileName, String ansPath){
        String startPath =  fileName; //pathName + File.separator +
        String endPath = ansPath + File.separator;
        try{
            File startFile = new File(startPath);
            File tmpFile = new File(endPath);//获取文件夹路径
            if(!tmpFile.exists()){//判断文件夹是否创建，没有创建则创建新文件夹
                tmpFile.mkdirs();
            }
            System.out.println(endPath + startFile.getName());

            if (startFile.renameTo(new File(endPath + startFile.getName()))) {
                System.out.println("File is moved successful!");
                this.logger.info("文件移动成功！文件名：《{}》 目标路径：{}",fileName,endPath);
            } else {
                System.out.println("File is failed to move!");
                this.logger.info("文件移动失败！文件名：《{}》 起始路径：{} 目标路径：{}",fileName,startPath, endPath);
            }

        } catch(Exception e){
            this.logger.info("文件移动异常！文件名：《{}》 起始路径：{}",fileName,startPath);
            throw e;
        } finally {

        }
    }

    public static void main(String[] args) throws Exception {
        Dotxt2db doTxt2DB = new Dotxt2db();
        for(String folder:folderList) {
            doTxt2DB.doIt(folder);
        }
    }
}

