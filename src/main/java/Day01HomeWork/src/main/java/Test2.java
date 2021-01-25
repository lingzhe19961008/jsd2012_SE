import jdk.nashorn.internal.ir.BreakableNode;
import jdk.nashorn.internal.ir.WhileNode;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("请输出：");
        String name=scan.nextLine();
        if(name.length()==0||name==null){
            System.out.println("用户名不能为空");
            for(int i=0;i<1;){
                System.out.println("请重新输出：");
                name=scan.nextLine();
                if (name.length()>=20&&name.length()==0){
                    System.out.println("用户名名不能超过20个字符");
                }else {
                    System.out.println("name:" + name);
                    break;
                }
            }
        }else if (name.length()>=20){
            System.out.println("用户名名不能超过20个字符");
            for(int i=0;i<1;){
                System.out.println("请重新输出：");
                name=scan.nextLine();
                if (name.length()>=20&&name.length()==0){
                    System.out.println("用户名名不能超过20个字符");
                }else{
                    System.out.println("name:"+name);
                    break;
                }
            }

        }else{
            System.out.println("name:"+name);
        }
    }
}
