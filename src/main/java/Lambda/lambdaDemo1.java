package Lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8推出了一个新的特性：lambda表达式
 * lambda表达式可以用更简短的语法常见匿名内部类
 * 语法：
 * （参数列表）-》{
 *     方法体
 * }
 *需要注意，使用lambda表达式创建时实现的接口中只能有一个抽象方法
 */
public class lambdaDemo1 {
    public static void main(String[] args) {
        FileFilter filter=new FileFilter() {
            public boolean accept(File file) {
                String name=file.getName();
                return file.getName().contains("e");
            }
        };
        //lambda表达式写法   最终会自动转换为上面的模式输出
        /**
         * 编译器会结合程序语义，分析出实现的是哪个结构？
         * 由于要求接口只能有一个抽象方法，所以也能知道重写的方法是什么.
         * 最终将它还原为 匿名内部类
         */
        FileFilter filter1=(File file)-> {
                return file.getName().contains("e");
            };
        //参数类型可以忽略不写 File
        FileFilter filter2=(file)-> {
            return file.getName().contains("e");
        };
        // 方法体只有一句的时候大括号也可以不写
        //并且如果该方法要求返回值，则return关键字也要一同忽略不写
        FileFilter filter3=(file)-> file.getName().contains("e");

    }
}
