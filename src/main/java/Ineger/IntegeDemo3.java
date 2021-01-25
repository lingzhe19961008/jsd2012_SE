package Ineger;

/**
 * JDK5推出了一个特性：自动拆装箱
 * 该特性是编译器认可的，当我们在基本类型和引用类型赋值时，
 * 编译器会在编译器间自动添加转换代码，将基本类型转换为包装类，或  反之
 * 使得我们在编写源代码时不在关注基本类型与包装类型之间的转换工作
 */
public class IntegeDemo3 {
    public static void main(String[] args) {
        int a=123;
        /**
         * 下面的代码触发了编译器的自动装箱特性：
         * 编译器会补充代码将基本类型转换为包装类，代码会变为
         * Integer i=Integer.valueOf(d);
         */
        Integer i=a;
        /**
         * 下面的代码触发了编译器的自动拆箱特性：
         * 编译器会补充代码将包装类 转换为基本类，代码会变为
         * a=i.intvalue();
         */
        a=i;
    }
}
