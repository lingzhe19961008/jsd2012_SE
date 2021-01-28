package Day05_Homework;

import io.day05.Person;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入名字");
        String name=scan.nextLine();
        System.out.println("请输入密码");
        String psw=scan.nextLine();
        System.out.println("请输入昵名");
        String nick=scan.nextLine();
        System.out.println("请输入年龄");
        int age=scan.nextInt();

        Person person=new Person(name,psw,nick,age);
        RandomAccessFile raf=new RandomAccessFile("User.java", "rw");
        FileOutputStream fos=new FileOutputStream("User.java");

        ObjectOutputStream ois=new ObjectOutputStream(fos);
        raf.seek(raf.length());
        byte[] date=name.getBytes("utf-8");
        date= Arrays.copyOf(date, 32);


        date=psw.getBytes("utf-8");
        date= Arrays.copyOf(date, 32);


        date=nick.getBytes("utf-8");
        date= Arrays.copyOf(date, 32);


        ois.writeObject(person);
        System.out.println("输入完毕");
        ois.close();

    }
}
