package io.day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
  使用文件流完成文件的复制操作
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /*
        1:创建文件输入流读取原文件
        2:创建文件输出流写入复制文件
        3:循环块读写完成复制
        4：关闭两个流
         */
        FileInputStream fis=new FileInputStream("user.dat");
        FileOutputStream fos_cp=new FileOutputStream("user_cp.dat");
        int len;
        byte [] data= new byte[1024*10];
        while ((len=fis.read(data))!=-1){
         fos_cp.write(data,0,len);
        }
        System.out.println("复制完成" );
        fis.close();
        fos_cp.close();
    }
}
