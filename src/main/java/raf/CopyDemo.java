package raf;

import com.sun.deploy.nativesandbox.NativeSandboxBroker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
    /*
    复制原理：从原文件中顺序读取
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile xh1=new RandomAccessFile("xh.jpg", "r");
        RandomAccessFile xh2=new RandomAccessFile("xh_cp.jpg", "rw");
        int a;
         while ((a=xh1.read())!=-1){
            xh2.write(a);
         }
        System.out.println("复制完毕");
         xh1.close();
         xh2.close();
    }
}
