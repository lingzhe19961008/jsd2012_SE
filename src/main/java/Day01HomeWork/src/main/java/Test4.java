public class Test4 {
    public static void main(String[] args) {
        String filename="hao123.png";

        boolean check =filename.endsWith(".png");

        if (check){
            System.out.println("是.png");
        }else{
            System.out.println("不是 .png");
        }
    }
}
