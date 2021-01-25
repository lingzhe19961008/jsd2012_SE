package Builder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("a");
        for (int i=0;i<1000000;i++){
            sb.append("a");//append相比+=运行性能会更好一些
        }
        System.out.println("ok");
        //StringBuilder的兄弟，使用一样
        // StringBuilder非线程安全，StringBuffer线程安全
        //在不考虑安全的情况下就builder
        StringBuffer sb1=new StringBuffer("b");
        sb1.append("a");
        System.out.println(sb1);
    }
}
