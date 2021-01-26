package File;

import doc.Demo;

import java.io.File;

/**
 * 使用File创建一个目录
 */
public class MKDirDemo {
    public static void main(String[] args) {
        //当前目录下创建一个新目录
        File dir=new File("Demo");

        if(dir.exists()){
            System.out.println("该目录已存在");
        }else{
            dir.mkdir();//将当前对象File对象标尺的目录创建出来
            System.out.println("目录已设置");
        }
    }
}
