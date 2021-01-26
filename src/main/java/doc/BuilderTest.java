package doc;

public class BuilderTest {
    public static void main(String[] args) {
       String  s1=getHostName("www.tedu.cm");
       String  s2=getHostName("http://www.tarena.com");
       String  s3=getHostName("www.canglaoshi.com.cn");

       System.out.println("s1:"+s1);//s1:tedu
        System.out.println("s2:"+s2);//s2:tarena
        System.out.println("s3"+s3);//s3:canglaoshi



    }
    public static String getHostName(String address){
        //地址中的第一个"."之后的第一个字符位置
        int start =address.indexOf(".")+1;
        //地址中第二个"."的位置
        int end=address.indexOf(".", start);
        return address.substring(start,end);
    }
}
