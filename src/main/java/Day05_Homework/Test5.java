package Day05_Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("content.txt");
        byte[] data=new byte[1000];
        int len =fis.read(data);

        String line=new String(data,0,len,"utf-8");
        System.out.println(line);

        fis.close();

    }
}
