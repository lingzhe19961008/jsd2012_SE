package Day05_Homework;
import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
	    FileOutputStream fos = new FileOutputStream("test_cp.txt");
	    BufferedOutputStream bos = new BufferedOutputStream(fos);

	      int d =0;
	      if((d =bis.read())==-1) {
		     bos.write(d);
	      }
	     System.out.println("复制完毕!");
    }
}
