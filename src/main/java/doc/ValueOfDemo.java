package doc;

/**
 * static String valueOf(XXX xxx)
 * String 提供了一组重载的静态方法：valueOf,作用是将java中其他类型转换为String
 * 最长使用于将基本类型转化为字符串
 */
public class ValueOfDemo {
    public static void main(String[] args) {
            int i=123;
            String  str=String.valueOf(i);
            System.out.println(str);

            double dou=123.123;
            String str2=String.valueOf(dou);
            System.out.println(str2);

            long l=123456L;
            String str3=String.valueOf(l);
            System.out.println(l);

            String s3=i+""; //任何内容与字符串连接结果都是字符串
        System.out.println(s3);
    }
}
