package day02_Homework;
import java.util.Scanner;
public class Test5 {

    public static void main(String[] args) {
		Person p = new Person();
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入姓名:");
		String name = scanner.nextLine();
		if(name.length()==0) {//此处的name不应是getname，应该是扫描出的age
			System.out.println("姓名不能为空!");
		}else{
			p.setName(name);
		}
		System.out.println("请输入年龄:");
		int age = scanner.nextInt();
		if(age<0&&age>100) {//此处条件的age应该是输出出来的age，不是getage
			System.out.println("年龄不合法!");
		}else{
			p.setAge(age);//此处不能用getage应该用setage，get为默认值
		}

		System.out.println("姓名:"+p.getName());
		System.out.println("年龄:"+p.getAge());
    }

	static class Person {
		private String name;
		private int age;

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
	}
}
