package io.day05;
/*
使用缓冲流完成文件复制

缓冲流：java.io.BufferedInputStream 和 BufferedOutputStream
他们是一对高级流，在流连接中的作用是提高读写效率
 */

import java.io.*;

public class copyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("yy.exe");
        BufferedInputStream bif= new BufferedInputStream(fis);
        FileOutputStream fos=new FileOutputStream("yy_cp.exe");
        BufferedOutputStream bof=new BufferedOutputStream(fos);

        /*
        缓冲流内部维护者一个字节数组，默认8k。，无论我们读写时用哪种方式
        最终都会被缓冲流转化为块读写8K8K的进行，来保证效率
         */

        int d;
        while ((d=fis.read())!=-1){
            bof.write(d);
        }
        System.out.println("复制完成" );
        bif.close();
        bof.close();
    }
}
