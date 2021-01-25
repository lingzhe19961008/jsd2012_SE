package Builder;

/**
 * String支持正则表达之防止之二
 * String[] split(string regex)
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str="asd123asd123asd123asd123";
        //拆分数字部分拆分
        String[] arr=str.split("[0-9]+");//"[0-9]+"正则表达式0-9
        //System.out.println(arr.length);//拆分后arr的长度
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

            str="123,456,789";
            //按照","拆分
            arr=str.split(",");//如果拆分.  .是关键字用\\.
            System.out.println(arr.length);
            for (int j=0;j<arr.length;j++){
                System.out.println(arr[j]);
                //如果连续出现,,中间会拆出一个空字符串
                // 如果在末尾连续出现可拆分项，所有拆分出来的空字符串会被忽略！
                //如果字符串最开始就是可拆分项，则拆分后的第一项是空字符串。
            }
        }
    }
}
