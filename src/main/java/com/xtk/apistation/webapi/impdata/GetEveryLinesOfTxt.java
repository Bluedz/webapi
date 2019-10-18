package com.xtk.apistation.webapi.impdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetEveryLinesOfTxt {
    // public List<String> lineContentList;
    public static List<String> getLineTxt(String filePathName) throws Exception {
        List<String> lists = new ArrayList<String>();

        boolean isFistLine = true;
        String filedContent;

        File file = new File(filePathName); //File 类提供了一种抽象方式，
        // 以便以与机器无关的方式处理机器相关情况下有关文件和路径名。
        //读取的时指定GBK编码格式，若中文出现乱码请尝试utf-8，window默认编码格式为GBK
        BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(file), "gbk"));
        // BufferedReader buffer = new BufferedReader(new FileReader(file));
        //此处利用BufferedReader，从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
        while ((filedContent = buffer.readLine()) != null) {

            String[] str = filedContent.split("@"); //据txt文件内的@号解析。
            if (str == null) {
                continue;    //逐行的读完为止。
            }
            // 逐行的动作
            lists.add(filedContent.toString());
            //System.out.println(filed_content);
        }
        buffer.close(); // 此行非常重要，否则移动文件的时候第二个就会出错
        return lists;
        // this.lineContentList = lists;
    }

    public static void main(String[] args) throws Exception {
        // getEveryLinesOfTxt tst = new getEveryLinesOfTxt();
        List<String> lineContentList =
                getLineTxt("D:\\_sync\\jobs\\西泰克\\备件接口项目\\文档\\内部约定\\matInfor\\MatInfor-20190911020339-20190910.TXT");
        for(String name:lineContentList) {
            System.out.println(name);
        }
    }
}
