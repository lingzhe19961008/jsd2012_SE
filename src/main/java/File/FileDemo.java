package File;


import java.io.File;

/**
 * java.in.File 可以表示硬盘上得一个文件或目录
 * 使用File可以：
 * 1访问该文件或目录属性（大小，修改日期，读写可写等）
 * 2创建和删除文件和目录
 * 3访问一个目录中得所有子项
 */
public class FileDemo {
    public static void main(String[] args) {
        /**
         * File创建庐江可以指定目录
         * 该路径通常使用相对路径，他有更好的跨平台性
         *
         * 相对目录中“./”表示当前目录具体是哪里
         * 要视当前程序的运行环境而定。
         *  在idea或者ecllipse里运行时
         * 当前目录就是这个程序所在的目录
         */
        File file=new File("./demo.txt");
        String name=file.getName();
        System.out.println(name);

        long len=file.length();
        System.out.println(len+"字节");

        boolean cr=file.canRead();
        System.out.println("可读"+cr);
        boolean  cw=file.canWrite();
        System.out.println("可写"+cw);
        boolean  ih=file.isHidden();//隐藏文件
        System.out.println("是否隐藏"+ih);

    }

}
