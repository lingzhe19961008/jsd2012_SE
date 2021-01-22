package doc;

/**
 * java.lang.String 用了final 在原来的基础上内容不可被修改
 * String内部都是一个一个的char，每一个字符都是16位（2个字节）的
 *字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间，用于缓存字面量形式
 * 创建的字符串对象，当再次使用相同字面量创建字符串时会直接重用常量池中的对象不会再次
   创建新对象减少内存开销
 */

public class StringDemo {
    public static void main(String[] args) {
        String s1="123abc";
        System.out.println("s1:"+s1);
        //s2字面量和s1相同，因此重用了上面s1创建的字符串对象
        String s2="123abc";
        System.out.println("s2:"+s2);
        System.out.println(s1==s2);//s1==s2为true，说明保存地址一致，用了同一个对象

        String s3= new String("123abc");//new 出来的对象是独立新建的对象
        System.out.println("s3"+s3);
        System.out.println(s2==s3);//s2==s3为false，new很强制，一定创建新对象
        //比较字符串内容要用equals!!!
        System.out.println(s2.equals(s3));//true ,比较的是字符串对像的内容是否相同

        s1 =s1+"!";//由于字符串是不变对象，修改内容就会创建新对象，不会影响原对象
        System.out.println("s1:"+s1);//s1内容发生改变
        System.out.println("s2:"+s2);//s2没变
        System.out.println(s1==s2);//false.s1已经不在和s2指向同一目标了

        /**
         * 编译器有一个特性：
         * 当编译器在编译一段代码时发现一个计算表达式可以在编译器确定结果时会进行计算，并
         * 将结果编译到class文件中。
         * 这样一来虚拟机运行该程序时就不必每次都进行计算了。
         * 下面的代码会被编译器改为：
         * String s4=“123abc”
         */
        String s4="123"+"abc";  //s4结果与123abc对象相同会默认指向123abc而不会指向一个新对象
        System.out.println("s4:"+s4);
        System.out.println("s4:"+s4);//ture  main中有123abc对象，不会指向新对象，所以ture

        String s="123";   //123在代码中没有123对象会新建一个新对象123
        String s5=s+"abc";   //此代码为s+abc
        System.out.println("s5:"+s5);
        System.out.println(s5==s2); //falus  s5对象等与s对象加”abc“，s2为“123abc”，不一样
    }
}
