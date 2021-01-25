package day02_Homework;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String regex2 = "^\\dX+$";
         String regex1 = "^[a-z 1-9 _]{3,15}$";
        System.out.println("请输入用户名：");
        Scanner  scan=new Scanner(System.in);
        String name=scan.nextLine();

        boolean match=name.matches(regex1);
        if(match){
            System.out.println("请输入年龄");
            String age=scan.nextLine();
            boolean boo=age.matches(regex2);
              if(boo){
                  System.out.println(age);
              }else {
                  System.out.println("输入年龄有误");
              }
        }else{
            System.out.println("用户名输入有误");
        }
        /**
         * if(age<101||age<=0){
         *
         * }else{
         *
         * }
         */

    }
}
