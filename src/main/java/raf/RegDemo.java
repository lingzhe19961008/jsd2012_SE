package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
用户祖册
程序启动后要求用户顺序输入用户名，密码，昵称，年龄
然后将该计入写入文件user.dat中保存

每条记录站用固定的100字节，其中用户名密码昵称为字符串，
各占32字节。年龄int值占4字节。


 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("欢迎注册");
        System.out.println("请输入用户名");
        String username=scan.nextLine();
        System.out.println("请输入密码");
        String password=scan.nextLine();
        System.out.println("请输入昵称");
        String nickname=scan.nextLine();
        System.out.println("请输入年龄");
        int    age=scan.nextInt();

        RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");
        raf.seek(raf.length());

        byte[] data =username.getBytes("utf-8");//创建字符数组 data转为utf-8
        data= Arrays.copyOf(data, 32);//数组扩容到32 末尾加一堆0的二进制
        raf.write(data);

        data =password.getBytes("utf-8");
        data= Arrays.copyOf(data, 32);
        raf.write(data);

        data =nickname.getBytes("utf-8");
        data= Arrays.copyOf(data, 32);
        raf.write(data);

        raf.writeInt(age);//写年龄
        System.out.println("注册完毕");
        raf.close();;
    }
}
