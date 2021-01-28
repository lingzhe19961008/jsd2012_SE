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
        String username=scan.nextLine();
        System.out.println("password");
        String password=scan.nextLine();

        RandomAccessFile raf= new RandomAccessFile("user.dat", "r");
        boolean ligin=false;//表示登陆是否成功
        for(int i=0;i<raf.length()/100;i++){
            raf.seek(i*100);
          byte[] data=new byte[32];
          raf.read(data);
          String name=new String(data,"utf-8").trim();
          if(name.equals(username)){
              raf.read(data);
              String psw=new String(data,"utf-8").trim();
              if(psw.equals(password)){
                  ligin=true;
              }
          }
        }
        if(ligin){
            System.out.println("登陆成功");
        }else{
            System.out.println("登陆失败");
        }
        raf.close();


    }
}
