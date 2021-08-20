package 第一阶段.模块二面向对象.方法和封装.构造方法;

/**
 * @author : Kevin Geng
 * @date : 2021/5/31 10:35 下午
 */
public class StudentTest {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(-18);
        s1.setName("哈哈");
        s1.show();
        System.out.println("---------------");

        Student s2 = new Student(-32, "哦哦");
        s2.show();


    }
}
