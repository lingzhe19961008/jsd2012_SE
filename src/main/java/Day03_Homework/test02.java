package Day03_Homework;
import javax.naming.Name;
import java.io.File;
import java.io.FileFilter;
public class test02 {
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            /* FileFilter filter=new FileFilter() {
                 public boolean accept(File file) {
                     return file.getName().contains("s");
                 }
             };*/
            FileFilter filter =
                    (file)->file.getName().contains("s");

            File[] str = dir.listFiles(filter);
            System.out.println(str.length);
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i].getName());
            }
        }
    }


}
