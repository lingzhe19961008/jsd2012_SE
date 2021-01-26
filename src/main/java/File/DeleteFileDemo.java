package File;

import java.io.File;

/**
 * 删除文件
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //将test.txt文件删除
        File file=new File("./Demo.txt");
        if(file.exists()){
            file.delete();
            System.out.println("文件已删除");
        }
    }
}
