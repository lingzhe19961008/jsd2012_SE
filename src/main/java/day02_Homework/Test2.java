package day02_Homework;

/**
 * URL是指统一资源定位符。
 * 统一资源定位符是对可以从互联网上得到的资源的位置和访问方法的一种简洁的表示，
 * 是互联网上标准资源的地址。
 * 互联网上的每个文件都有一个唯一的URL，
 * 它包含的信息指出文件的位置以及浏览器应该怎么处理它。
 */
public class Test2 {
    public static void main(String[] args) {
        String path = "http://localhost:8088/myweb/reg?name=zhangsan";
        String[] name=path.split("\\?");
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }

    }
}
