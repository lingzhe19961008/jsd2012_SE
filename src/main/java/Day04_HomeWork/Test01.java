package Day04_HomeWork;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test01 {
    public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("./test.txt","r");
		RandomAccessFile desc = new RandomAccessFile("./test_cp.txt","rw");

			int len;
			byte[] data = new byte[1024*10];
			               //没写读什么
            while((len = src.read(data))!=-1) { //desc的写没在括号里
                desc.write(data);
            }
			System.out.println("复制完毕!");
             src.close();
             desc.close();
    }
}
