package 集合类下.泛型机制.Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        System.out.println("------------------------------------");
//        3、实现元素总的查找功能
        boolean b1 = m1.containsKey("11");
        System.out.println(b1);
        b1 = m1.containsKey("1");
        System.out.println(b1);

        b1 = m1.containsValue("one");
        System.out.println(b1);

        b1 = m1.containsValue("eleven");
        System.out.println(b1);

        String str2 = m1.get("5");
        System.out.println("b2 = " + str2);

        str2 = m1.get("3");
        System.out.println("b2 = " + str2);

        System.out.println("------------------------------------");

//        4、实现元素中的删除操作
        str2 = m1.remove("1");
        System.out.println("删除的内容是"+str2);

        System.out.println("------------------------------------");
//        5、获取map中所有的key并组成set集合
        Set<String> s1 = m1.keySet();
        for (String s : s1
        ) {
            System.out.println(s + " = " + m1.get(s));
        }

        System.out.println("------------------------------------");
//        6、获取map中所有的value并组成collection视图
        Collection<String> c1 = m1.values();
        for (String th : c1
        ) {
            System.out.println("th = "+th);
        }
        System.out.println("------------------------------------");
//        7、获取map中所有的键值队并组成collection视图
        Set<Map.Entry<String, String>> entries = m1.entrySet();

        for (Map.Entry<String, String> s : entries
        ) {
            System.out.println(s);
        }


    }
}
