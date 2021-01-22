package doc;

/**
 * 文档注释只用在三个地方，类，方法，常量
 * 文档注释是功能级注释，在类上使用时是用来说明当前类的设计意图和整体功能
 * @aouther 作者  公司会用
 *
 *
 */
public class Demo {
    /**
     * sayHellow 中用到的问候语
     */
 public static final String INFO="你好";
    /**
     *
     * 为制定的用户添加一个问候语
     * @param name 用户指定的名字
     * @return  有问候语的字符串
     */
   public String sayHellow(String name){
       return "你好"+name;
   }
}
