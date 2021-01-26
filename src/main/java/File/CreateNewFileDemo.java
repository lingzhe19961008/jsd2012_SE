package File;

import java.io.File;

/**
 * 使用File创建一个文件
 */

public class CreateNewFileDemo {
    public static void main(String[] args) {
        //在当前目录下创建一个新文件
        File file=new File("./test.txt");
        if(file.exists()){//判断文件或目录是否已经存在，存在if 不存在else
            System.out.println("文件已存在");
        }else{
            System.out.println("文件已创建");
        }
    }
}
