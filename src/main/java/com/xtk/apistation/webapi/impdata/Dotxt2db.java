package com.xtk.apistation.webapi.impdata;

import com.xtk.apistation.webapi.bean.LogOfImport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.List;

public class Dotxt2db<main> {
    // def log
    private  Logger logger = LoggerFactory.getLogger(this.getClass());

    // init
    private static String[] folderList = { "MatAccounts" };
    private  static String root = "D:\\test\\";

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

                //build log obj
                LogOfImport loi = new LogOfImport();
                loi.setNameOfTxtfile( fileName );
                loi.setNameOfInterface( folderName );
                loi.setNumberOfLine(new BigDecimal(lineNum));
                loi.setContentOfOneline(lineTxt);  // lineCont
                loi.setResultOfImport( flag + " " );
                loi.setErrorMessage(tryWrDB.errorMeg);
                this.logger.info( "ImpR:---  " +
                        new ImpRecord().insertRecord(loi)
                );

                //
                this.logger.info("Result : " + flag);
                this.logger.error("ErrorMeg : " + tryWrDB.errorMeg);

                //
/*                System.out.println(
                        fileName + "\n" +
                                folderName + "\n" +
                                "time" + "\n" +
                                lineCont + "\n" +
                                lineNum + "\n" +
                                flag + "\n" +
                                "ErrorMeg : " + tryWrDB.errorMeg


                );*/


            }
//            System.out.println("========================================================");
        }

    }

    public static void main(String[] args) throws Exception {
        Dotxt2db doTxt2DB = new Dotxt2db();

        for(String folder:folderList) {
            doTxt2DB.doIt(folder);
        }
    }
}

