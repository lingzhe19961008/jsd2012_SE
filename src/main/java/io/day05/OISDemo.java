package io.day05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 对象输出流
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //读取person.obj文件中的person对象
        FileInputStream fis=new FileInputStream("person.obj");
        ObjectInputStream ois=new ObjectInputStream(fis);

        /**
         * Object readObject()
         * 对象输入流提供了readObject方法
         * 可以将读取的字节还原为应对的java对象，
         * 前提是读取的字节应当是对象输出流将
         * 一个对象转换的一组字节。返回时统一以Object类型返回，
         * 因此接收到该对象后要造型。
         */
        Person p=(Person) ois.readObject();
        System.out.println(p);

        ois.close();
    }
}
