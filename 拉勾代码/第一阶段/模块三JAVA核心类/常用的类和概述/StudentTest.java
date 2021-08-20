package 第一阶段.模块三JAVA核心类.常用的类和概述;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1001, "张飞");
        Student s2 = new Student(1002, "关羽");

//        下面调用冲Object中继承下的equals方法
        boolean b1 = s1.equals(s2);

        System.out.println("b1="+b1);
        System.out.println(s1 == s2);
    }
}
