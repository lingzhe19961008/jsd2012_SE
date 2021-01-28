package io.day05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * java标准的io，可以用相同的方式读写
 * java将 IO比喻为"流"，可以理解为连接程序与设备之间的"管道"，
 * 管道里面是按照同一个方向顺序流动的字节。
 *
 * java将流的方向划分为俩个操作
 * 输入：用来读写，是从设备到程序的方向，是用来获取数据使用的
 * 输出：用来读写，是从程序到设备的方向，用来发送数据使用的
 *
 * java.io.InputStream是所有字节输入流的超类，里面定义了读取字节的方法
 * java.io.OutputStream是所有字节输出流的超类，定义了写字节的方法
 *
 * java将流分为两类：节点流和处理流
 * 节点流：也成为低级流，是实际连接程序与设备的管道，负责实际读取字节的流，
 * 读写是一定建立在节点流的基础上进行的。操作不同的设备有对应的低级流。
 * 例如写读文件有文件流。
 *
 * 处理流：也称为高级流，不能独立存在，必须链接在其他流上，
 * 目的是当数据”流经“当前流时对其做某些加工处理，简化我们的操作
 * 实际开发中我们总是会串联一组高级流最总连接到低级流上，
 * 在数据读写的过程中对数据做流水线式的加工处理，这也成为流连接 也是io
 *
 * 文件流
 * 文件流是一种对低级流，用去读写文件的流，功能与raf相同
 * java.io.FileInputStream和FileOutputStream
 *
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {

        /*
        文件出书流构造方法？：
        FileInputStream(String path)    入
        FileOutputStream(File file)     出
        以上两种结构器创建的文件流为覆盖写模式
        即：创建文件流时如果指定的文件已经   存在则会将该文件清空
        然后使用这个流写出的顺序写入作为新数据保存
        注： RAF则时从头开始写多少覆盖多少（在不操作指针的情况下）

        文件流重载的构造方法
        FileOutputStream(String path,boolean apped)
        Fileoutputstream(File file , boolean append)
        如果第二个参数指定，并且指定的值为true时，
        则当前文件流为追加模式。即:创建文件流时如果文件存在，
        那么文件原有数据保留通过这个流写入的数据都会被追加到文件中。
         */

        FileOutputStream fos=new FileOutputStream("fos.txt", true);
        String line="举头望明月，低头思故乡";
        byte[] data=line.getBytes("utf-8");
        fos.write(data);

        line="门前大桥下流过一群鸭";
        fos.write(line.getBytes("utf-8"));


       fos.write("啦啦啦啦啦啦".getBytes("utf-8")); //fos/fis是直接覆盖而不是新位置写

        fos.write("wuwuwuwuwuwu".getBytes("utf-8"));
        System.out.println("写出完毕");
        fos.close();
    }
}
