package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用文件输入流读取文件数据
 *
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(
                "fos.txt");
        byte[] data=new byte[1000];//读取1000个字符
        int len=fis.read(data);
        System.out.println("实际读取了"+len+"个字节");
        /*
        将给定的字节数数组从下标offset处的连续几个len个字节按照 utf-8
        编码转换为字符串
         */
        String line=new String(data,0,len,"utf-8");
        System.out.println(line);
        System.out.println(line.length());

        fis.close();
    }
}
