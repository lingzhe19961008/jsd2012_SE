package Day04_HomeWork;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Filter;

public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("username:");
        String use=scan.nextLine();
        System.out.println("password");
        String pass=scan.nextLine();

        RandomAccessFile raf= new RandomAccessFile("user.dat", "r");
        for(int i=0;i<raf.length()/100;i++){
          byte[] data=new byte[32];
          raf.read(data);//username
          String username=new String(data,"utf-8");

          raf.read(data);//password
          String password=new String(data,"utf-8");
            raf.read(data);//nickname
            raf.readInt();//age
            if(username.equals(use)&& password.equals(pass)){
                System.out.println("用户名密码正确");
                break;
            }else{
                System.out.println("用户名密码错误");
            }
        }
        raf.close();


    }
}
