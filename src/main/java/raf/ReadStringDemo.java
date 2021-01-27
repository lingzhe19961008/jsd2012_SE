package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile(
                 "raf.txt","r" );
        byte[] data=new byte[(int)raf.length()];//raf是byte型，强转int使用

        raf.read(data); //一次性将文件所有字节写入数组

        String line=new String(data,"UTF-8");
        System.out.println(line);
        raf.close();
    }
}
