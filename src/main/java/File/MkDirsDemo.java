package File;

import java.io.File;

/**
 * 创建一个多级目录
 */
public class MkDirsDemo {
    public static void main(String[] args) {
        //在当前目录下新建项目a/b/c/d/e/f,前提目录一定要纯在
        File dir=new File("./a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("目录已存在");
        }else{
            /**
             * 与mkdir方法的区别是mkdirs会将不纯在的父目录自动创建，
             * 而mkdir不会，如果父目录不存在则创建不成功
             */
            dir.mkdirs();
            System.out.println("目录已创建");
        }
    }
}
