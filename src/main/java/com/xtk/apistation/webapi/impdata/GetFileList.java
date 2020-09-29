package com.xtk.apistation.webapi.impdata;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetFileList {
    public  List<String> fileList;

    public static List<String> getFiles(String path) {
        List<String> files = new ArrayList<String>();
        File file = new File(path);
        File[] tempList = file.listFiles();

        String tempStr, tempStrFileExend; // 判断并排除非txt

        for (File value : tempList) {
            if (value.isFile()) {
                // 判断并排除非txt
                tempStr = value.toString().toLowerCase();
                tempStrFileExend = tempStr.substring(tempStr.length()-3);
                if(tempStrFileExend!="txt" & ! tempStrFileExend.equals("txt")){
                    System.out.println("file extend name is not 'TXT'");
                }
                else  files.add(value.toString());
                //文件名，不包含路径
                //String fileName = tempList[i].getName();
            }
            if (value.isDirectory()) {
                //这里就不递归了，
            }
        }
        return files;
    }

    public static void main(String[] args) {
        // 测试读取文件列表效果 --
        String uri = "D:\\testOver\\MatAccounts";
        List<String> result = getFiles(uri);
        for(String name:result) {
            System.out.println(name);
        }
        // --
    }
}
