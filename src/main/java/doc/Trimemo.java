package doc;

/**
 *String trim()
 * 去除字符出串两边的空白字符
 */
public class Trimemo {
    public static void main(String[] args) {
        //            左侧三个空格右侧3个TAB
        String str ="   hello            ";
        System.out.println(str);
        String trim= str.trim();//两边的空白出都去除了
        System.out.println(trim);
    }
}
