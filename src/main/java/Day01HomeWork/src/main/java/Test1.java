public class Test1 {
    public static void main(String[] args) {
        String fileName1 = "logo.png";//要png
        String fileName2 = "jquery.1.1.2.js";//要js

        String ext = getExtByName(fileName1);
        System.out.println(ext);//png
        ext = getExtByName(fileName2);
        System.out.println(ext);//js
    }

    /**
     * 获取给定文件名中的后缀名部分
     *
     * @param name 文件名
     * @return
     */
    public static String getExtByName(String name) {
        int start=name.lastIndexOf("")+1;
        String sub=name.substring(start);
        return sub;
    }
}
