package Day03_Homework;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class test01 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
    while (true){String str=scan.nextLine();

        File file=new File(str);
        if(file.exists()){
           System.out.println("文件已存在");
        }else{
            System.out.println("已创建");
       }

      }
    }
}
