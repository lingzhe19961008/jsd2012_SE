
package Builder;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.Scanner;
/*
String支持正则表达式的方法之三

String replaceAll(String regex,String str)
将当前字符串中满足正则表达式的全部改为一个String
 */
public class RePlaceAll {
    public static void main(String[] args) {
      String str ="abc123abc123abc123abc123";
      //将字符串中的0-9部分替换为”#NUMBER#“
      str= str.replaceAll("[0-9]+","#NUMBER#");
        //将满足部分替换为空字符串可以达到“去除”的效果
       // str= str.replaceAll("[a-z]+"," ");

      //str= str.replaceAll("[a-z]+","#NUMBER#");//将满足字母a到z替换为number
        System.out.println(str);
      //可以用于游戏中和谐喷子骂的词
      Scanner scan=new Scanner(System.in);
      String pz=scan.nextLine();
      String regex="(sb|dsb|mdzz|cnm)";
      //String message="sb,我cnm";
      pz =pz.replaceAll(regex, "***");
        System.out.println(pz);
    }
}
