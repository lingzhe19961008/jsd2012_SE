package Builder;
/**
 * String支持正则表达式的方法之一:
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否符合合格式要求，符合返回true
 */
public class MathchesDemo {
    public static void main(String[] args) {
        /**
         * 邮箱的正则：[a-zA-Z0-9_]+@[a-zA-z0-9]+(\.[a-zA-Z]+)+
         */
        String email="fancq@tedu.cn";
        String regex="[a-zA-Z0-9_]+@[a-zA-z0-9]+(\\.[a-zA-Z]+)+";
        boolean match=email.matches(regex);//判断email符不符合正则表达式
        if(match){
            System.out.println("是邮箱");
        } else {
            System.out.println("不是邮箱");
        }
    }
}
