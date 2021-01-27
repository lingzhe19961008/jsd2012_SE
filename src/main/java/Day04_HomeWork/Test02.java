package Day04_HomeWork;

import sun.security.util.Password;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入用户名");
        String newusername=scan.nextLine();
        System.out.println("请输入昵名");
        String newnickname=scan.nextLine();

        RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");

        for (int i=0;i<raf.length()/100;i++){
           byte[] date=new byte[32];
           raf.read(date);
           String username=new String(date,"utf-8");
           if(username.contains(newusername)){
              raf.seek(32);
              
           }

            date=new byte[32];
            raf.read(date);

            date=new byte[32];
            raf.read(date);

           int age= raf.readInt();
            System.out.println(username);

        }
        raf.close();
    }
}
