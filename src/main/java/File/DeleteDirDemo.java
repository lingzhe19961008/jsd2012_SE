package File;

import java.io.File;

/**
 * 删除目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File file=new File("./demo");
        if(file.exists()){
            /**
             * delete删除方法删除目录时要求
              该目录必须是一个空目录才行
             */


            file.delete();
            System.out.println("目录已删除");
        }else {
            System.out.println("目录不存在");
        }
    }
}
