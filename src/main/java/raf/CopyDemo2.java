package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量减少实际读写的次数可以提高读写效率
 * 单子接读写是随机读写
 * 一组字节读写是块读写
 * 对于机械硬盘而言，单字节读写几乎没有效率可言，块读写效率很好
 * 对于大部分硬件而言，减少硬件调用次数都可以提高效率
 *
 //RAFt提供的块读写方法：
 // 块写：
 //void write(byte[] data);
 //一次性将给定的字节数组中所有字节写入文件

 //void write (byte[]    data ,int offset,int len)
 //一次性将给定数组中从下
 块读
 int read(byte[]data);
 一次性从文件中读取给定的字节数组data总长度的字节量
 并读取到的字节顺序的存入，到该数组中返回值为实际读取到的字节量，
 如果返回值为-1表示读取到了文件末尾

 文件数据：
  1101101  1101101   1101101   1101101  1101101  1101101  1101101  1101101

 块读操作：
  byte[] data =new byte[6];//6字节数组
  data：[00000000,00000000,00000000,00000000,00000000,00000000,00000000,00000000]
  int len=raf.read(data);
  data:[ 1101101,1101101 , 1101101 ,  1101101 , 1101101 , 1101101 , 1101101]
 len:5//read方法返回值为5，说明本次实际只读取到了5个字节
 与单字节读取区别
 int d=raf.read();&#x8BFB;&#x53D6;&#x4E00;&#x4E2A;&#x5B57;&#x8282;&#xFF0C;&#x8FD4;&#x56DE;&#x503C;&#x5C31;&#x662F;&#x5B9E;&#x9645;&#x8BFB;&#x53D6;&#x7684;&#x5B57;&#x8282;
 d:00000000 00000000 00000000 11011010//该字节放在低八位上
 00000000  8位2进制 1byte  1字节
 1024byte =1kb。。。。tb
 */


public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile xh1=new RandomAccessFile("xh.exe", "r");
        RandomAccessFile xh2=new RandomAccessFile("xh_cp.exe", "rw");
        /*int len;                               //记录每次块读数据后，实际读取到的字节数
        byte[] data=new byte[1024*10];//10kb
                                            //long start =System.currentTimeMillis();
        while ((len=xh1.read(data))!=-1){ //读取10kb
            xh2.write(data,0,len);//读了多少就写多少写10kb
        }*/
                                            //long end =System.currentTimeMillis();
                                            //System.out.println("复制完毕！耗时"+(end-start)+"ms");
        int len;
        byte[] data=new byte[1024*10];
        while ((len=xh1.read(data))!=-1){
            xh2.write(data, 0, len);
        }
        xh1.close();
        xh2.close();
    }
}
