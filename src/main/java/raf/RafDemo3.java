package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用Raf读写基本数据类型，及RAF指针的操作
 */
public class RafDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf= new RandomAccessFile(
                "raf.txt", "rw");
        //获取RAF的指针位置，默认0开始
        long pos=raf.getFilePointer();
       // System.out.println("pos:"+pos);
        /**
         * 向一个文件中写入一个int最大值
         * int最大值的二进制：
         * 01111111 11111111 11111111 11111111
         * imax>>>24
         * 00000000 00000000 00000000 01111111
         * imax>>>16
         * 00000000 00000000 01111111 11111111
         * imax>>>8
         * 00000000 01111111 11111111 11111111
         * raf.dat文件数据：
         * 01111111 11111111 11111111 11111111
         */
        int imax=Integer.MAX_VALUE;
        raf.write(imax>>>24);
        //System.out.println("pos:"+raf.getFilePointer());
        raf.write(imax>>>16);
        raf.write(imax>>>8);
        raf.write(imax);

        //System.out.println("pos:"+raf.getFilePointer());
        /**
         * RAF提供了方便写出基本数据类型的方法
         */
        raf.writeInt(imax);//连续写4字节
        //System.out.println("pos:"+raf.getFilePointer());
        raf.writeLong(1111);
        //System.out.println("pos:"+raf.getFilePointer());

        raf.writeDouble(11.111);
        //System.out.println("pos:"+raf.getFilePointer());


        System.out.println("写出完毕");

        raf.seek(0);//指向到第几个字符
       // System.out.println("pos:"+raf.getFilePointer());
        int d=raf.readInt();
        System.out.println(d);//int最大值
        //System.out.println("pos:"+raf.getFilePointer());

        //读取long值
        raf.seek(8);//跳转到第八个字节
        long l=raf.readLong(); //声明第八个字节
        System.out.println(l);
        double dou=raf.readDouble();
        System.out.println(dou);
        System.out.println("pos:"+raf.getFilePointer());
        //修改第八个long为456
        raf.seek(8);//跳转到低8个字节
        raf.writeLong(456);//覆盖写成456

        raf.seek(8);
        l=raf.readLong();
        System.out.println(l);

        raf.close();

    }
}
