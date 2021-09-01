package 集合类上.collection接口.set接口.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {

//        1、准备一个TreeSet类型对象
        Set<String> s1 = new TreeSet<>();
        System.out.println("s1 = " + s1);
//        2、向集合中添加String类型的对象并打印
        boolean b1 = s1.add("aa");
        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);

        b1 = s1.add("cc");
        System.out.println("b1 = " + b1);
        System.out.println("s1 = " + s1);


        b1 = s1.add("bb");
        System.out.println("b1 = " + b1);

        // 由于 Treeset集合的底层是采用红黑树实现的,因此元素有大小次序,默认从小到大打印
        System.out.println("s1 = " + s1);
        System.out.println("-------------------------------------");
//        3.准备一个 TreeSet集合并放入 Student类型的对象并打印
        Set<Student> s2 = new TreeSet<>();
        s2.add(new Student("关羽", 35));
        s2.add(new Student("刘备", 40));
        s2.add(new Student("张飞", 30));
        System.out.println("s2 = " + s2);

    }
}
