package io.day05;

import java.io.*;

/**
 * 使用缓冲输出流写出数据的缓冲区问题
 *
 *
 */

public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bostest.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        String line="鹅鹅鹅曲项向天歌";
        byte[]  data=line.getBytes("utf-8");
        bos.write(data);
        bos.flush();
        /*
        void flush()
        将缓冲流中已经缓冲的数据一次性写出
        频繁的调用flush会增加实际写出数据的次数，
        写的次数多则写效率差。但是可以提高写出数据的即时性
         */
        System.out.println("写出完毕");
        bos.close();
        /*
          缓冲流的close方法中会执行一次flush
          在不使用flush的情况下也不会不输出已经缓冲的数据
         */
    }
}
