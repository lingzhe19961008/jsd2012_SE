package Day03_Homework;
import java.io.*;
import java.util.logging.Filter;

public class test03 {
    public static void main(String[] args)  throws IOException{
      File dir=new File(".");
      if(dir.isDirectory()){
          FileFilter filter=(file)->file.isFile();
      }


      File[] subs=dir.listFiles();//遍历所有获取回来得文件并复制
      for(int i=0;i<subs.length;i++){
          String fileName=subs[i].getName();//获取每一个子项得文件名

          //将文件名拆分为两部分，名字和后缀
          int index=fileName.lastIndexOf(".");//找到文件中最后一个.

          //截取文件名test
          String name=fileName.substring(0, index);

          //截取后缀名：.dat
          String ext =fileName.substring(index);

          //复制文件的名字
          String copyFileName=name+"_cp"+ext;
          RandomAccessFile src = new RandomAccessFile(subs[i],"r");
          RandomAccessFile desc = new RandomAccessFile(copyFileName,"rw");
          int d;
          while ((d=src.read())!=-1){
              desc.writeInt(d);
          }
          System.out.println("复制完毕");
          src.close();
          desc.close();


      }
    }
}
