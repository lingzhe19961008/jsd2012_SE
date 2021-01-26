package File;

import java.io.File;
import java.io.FileFilter;
import java.util.logging.Filter;

/**
 * 获取一个目录中指定条件的所有子项
 *
 * File[] listFiles(FileFilter filter)
 *
 * 该方法会将该目录中的所有子项都经过一次给定的过滤器，
 * 然后保留并返回符合要求的子项
 */
public class ListFileDemo2 {
    public static void main(String[] args) {
        /**
         * 获取当前目录中的所有名字中含有“e”的子项
         */
        File dir=new File(".");
        if (dir.isDirectory()) {     //lambda表达式写的匿名内部类
            FileFilter filter =(file) ->file.getName().contains("e");

            /*FileFilter filter=new FileFilter() {  //正常写法
                public boolean accept(File file) {
                    String name=file.getName();
                    return file.getName().contains("e");
                }
            };*/

            /**
             * 重载的listfile方法会将dir中每一个子项都经过一次给定的过滤器的
             * accept方法，并最终返回所有返回为TRUE的子项
             */
            File[] subs = dir.listFiles(filter);
            System.out.println("子项的个数" + subs.length);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i]);
            }
        }
    }
}
