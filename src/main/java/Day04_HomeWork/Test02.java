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
        String username=scan.nextLine();
        System.out.println("请输入昵名");
        String nickname=scan.nextLine();

        RandomAccessFile raf=new RandomAccessFile("user.dat", "rw");

        boolean update=false;;//记录是否有昵名被修改过
        for (int i=0;i<raf.length()/100;i++){

           raf.seek(i*100);
            byte[] date=new byte[32];
           raf.read(date);
           String name=new String(date,"utf-8").trim();
           if(name.contains(username)){
              raf.seek(i*100+64);
              date=nickname.getBytes("utf-8");
              date=Arrays.copyOf(date, 32);
              raf.write(date);
              update=true;
              break;
           }

        }
        if(update){
            System.out.println("修改完毕");
        }else{
            System.out.println("查无此人");
        }
        raf.close();
    }
}
