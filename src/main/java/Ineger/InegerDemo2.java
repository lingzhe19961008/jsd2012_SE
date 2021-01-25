package Ineger;

import java.sql.SQLOutput;

public class InegerDemo2 {
    public static void main(String[] args) {
        //获取int最大值
        /*int imax=Integer.MAX_VALUE;
        int imin=Integer.MIN_VALUE;
        long lo=Integer.MAX_VALUE;
        double dou=Integer.MAX_VALUE;
        System.out.println(imax);
        System.out.println(imin);
        System.out.println(lo);
        System.out.println(dou);*/
        /**
         * 包装类提供了一个静态方法parseXXX(String line)
         * 可以将字符串解析为对应的基本类型数据。
         * 前提是该字符串正确的描述了基本类型可以报存的值。否则抛出异常
         *
         */
        String str="111";
        System.out.println(str);
        int in=Integer.parseInt(str);
        System.out.println(in+1);
        double dou=Double.parseDouble(str);
        System.out.println(dou+1);

    }
}
