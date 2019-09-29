package com.xtk.apistation.webapi.impdata;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class dotxt2db<main> {
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

        fileList = getFileList.getFiles(path); // get file list in one folder
        for(String fileName:fileList) { // get each file in file list
            linesOfFile = getEveryLinesOfTxt.getLineTxt(fileName);
            for(String lineTxt:linesOfFile) { // get each line of file
                // clear line
                lineTxt = new dotxt2db().delSpaceChar(lineTxt);
                lineTxt = new dotxt2db().fillLastSpace(lineTxt);
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
                // switch
                flag =  tryWrDB.insertRecord(lineCont, folderName);
                //
                this.logger.info("Result : " + flag);
                // System.out.println(this.logger.toString() + "ErrorMeg:" + tryWrDB.errorMeg + "\n");
                this.logger.error("ErrorMeg : " + tryWrDB.errorMeg);


            }
//            System.out.println("========================================================");
        }

    }

    public static void main(String[] args) throws Exception {
        dotxt2db doTxt2DB = new dotxt2db();

        for(String folder:folderList) {
            doTxt2DB.doIt(folder);
        }
    }
}

