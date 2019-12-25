package com.xtk.apistation.webapi.service;

import com.xtk.apistation.webapi.impdata.Dotxt2db;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.xtk.apistation.webapi.impdata.Dotxt2db;

public class createOrderFileToREP {
    public static void createFile(String fileName, String str) throws IOException {
        // 生成的文件路径
        // Random rdm = new Random(); rdm.nextInt(10000)
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String timeStr = df.format(new Date());
        String tstPathFragment = "tst_"; // " "
        String path = Dotxt2db.root + // "D:\\EXCHANGE\\" "E:\\Codes\\idea\\APIStation\\testDatas\\EXCHANGE\\" +
                /*tstPathFragment +*/ fileName + "\\" +
                fileName + "-" + timeStr + "-" + System.currentTimeMillis() + ".txt";
        File file = new File(path);
        /* 创建目录 */
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        // write 解决中文乱码问题
        // FileWriter fw = new FileWriter(file, true);
        OutputStreamWriter fw = new OutputStreamWriter(new FileOutputStream(file), "GB2312");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.flush();
        bw.close();
        fw.close();

    }
}
