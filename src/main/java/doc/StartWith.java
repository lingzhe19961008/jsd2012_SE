package doc;

/**
 * boolean startWith(String str)
 * 判断字符串是否是以给定的字符串开始的
 *
 *
 * boolean endsWith(String str)
 * 判断字符串是否是以给定的字符串结尾
 */
public class StartWith {
    public static void main(String[] args) {
        String str="www.tedu.cn";
         //判断str是否是以“www”开始的
        boolean starts=str.startsWith("www");
        System.out.println("starts:"+starts);
        //判断str是否是以“com”结尾的
        boolean ends=str.endsWith("com");
        System.out.println("ends:"+ends);
    }
}
