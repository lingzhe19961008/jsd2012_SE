package doc;

/**
 * String substring(int start,int end)
 * 截取制定范围内的字符串。两个参数分别是范围对应的下标
 * 注：在JAVA API中通常使用两个数字表示范围时都是“含头不含尾”的
 *
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //
        String host="www.tedu.cn";
        String sub =host.substring(4, 8);//需要tedu，则从4开始需到8才可以，到7不包括e
        System.out.println(sub);

        //重载的substring传入一个参数为：从指定位置截取到字符串末尾
        sub=host.substring(4);
        System.out.println(sub);
    }
}
