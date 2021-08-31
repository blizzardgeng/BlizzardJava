package 集合类下.泛型机制.Map集合;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
//        1、准备一个Map
        Map<String, String> m1 = new HashMap<>();
        System.out.println("m1 = "+m1);         //调用toString方法

//        2、添加元素并打印
        String str1 = m1.put("1", "one");
        System.out.println("原来的数值是" + str1);
        System.out.println("m1 = " + m1);

        str1 = m1.put("2", "two");
        System.out.println("原来的数值是" + str1);
        System.out.println("m1 = " + m1);

        str1 = m1.put("3", "three");
        System.out.println("原来的数值是" + str1);
        System.out.println("m1 = " + m1);

        str1 = m1.put("1", "eleven");
        System.out.println("原来的数值是" + str1);
        System.out.println("m1 = " + m1);




    }
}
