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

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                files.add(tempList[i].toString());
                //文件名，不包含路径
                //String fileName = tempList[i].getName();
            }
            if (tempList[i].isDirectory()) {
                //这里就不递归了，
            }
        }
        return files;
    }

    public static void main(String[] args) {
        // 测试读取文件列表效果 --
        String uri = "D:/_sync/jobs/西泰克/备件接口项目/文档/需求文档";
        List<String> result = getFiles(uri);
        for(String name:result) {
            System.out.println(name);
        }
        // --
    }
}
