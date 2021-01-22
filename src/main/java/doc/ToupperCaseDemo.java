package doc;

/**
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全小写
 *
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全大写
 *
 */
public class ToupperCaseDemo {
    public static void main(String[] args) {
        String str="我爱Java";
       //将英文部分变成大写
        String upper=str.toUpperCase();
        System.out.println(upper);
        //将英文部分变成大写
        String lower = str.toLowerCase();
        System.out.println(lower);
    }
}
