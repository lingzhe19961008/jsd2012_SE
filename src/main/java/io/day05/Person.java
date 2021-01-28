package io.day05;

/*
使用当前类测试对象流的对象读写操作

当一个类的实例希望被对象进行写读时，该类必须实现接口
java.io.Serializable
 */

import java.io.Serializable;
import java.util.Arrays;
/*签名接口Serializable 接口中没有任何抽象方法，这是一个签名接口，该接口是
*编译器敏感的结构， 当编译器编译一个类时如果这个类实现了序列化接口
* 则会在编译后的class文件中添加一个方法，作用是按照该类结构转换为
* 一组字节（对象流就是依靠这个方法做对象序列化的）
*
*/

public class Person implements Serializable {
    private String name;
    private  int age;
    private  String gender;
    private  transient String[] otherInof;

    public Person(String name, String psw, String nick) {
    }

    public Person(String name, String psw, String nick, int age) {
    }
    /*
    transient 关键字可以在对象序列化时忽略该属性的值   加哪瘦哪加
    忽略不重要的属性可以达到对象序列化时的瘦身操作，减少资源开销
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInof() {
        return otherInof;
    }

    public void setOtherInof(String[] otherInof) {
        this.otherInof = otherInof;
    }

    public Person(String name, int age, String gender, String[] otherInof) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInof = otherInof;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInof=" + Arrays.toString(otherInof) +
                '}';
    }
}
