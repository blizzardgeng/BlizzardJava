package 集合类.Iterator接口;

import 集合类.collection类.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPrintTest {
    public static void main(String[] args) {

//        1、准备一个collection集合
        Collection c1 = new ArrayList();
        c1.add("one");
        c1.add(2);
        c1.add(new Person("张飞", 30));
        //遍历方式1，自动调用toString方法，String类型的整体
        System.out.println("c1 = " + c1);         //c1 = [one, 2, Person{name='张飞', age=30}]
        System.out.println("--------------------------------------------");
//        2、使用迭代器遍历
        Iterator iterator = c1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        3、使用迭代器模拟toString方法
        //上个循环迭代器已经走到最后，所以需要重置迭代器
        iterator = c1.iterator();
        StringBuilder str = new StringBuilder();
        str.append("[ ");
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (!iterator.hasNext()) {
                str.append(obj).append(" ]");
            } else {
                str.append(obj).append(", ");
            }


        }

        System.out.println(str.toString());
        System.out.println("--------------------------------------------");

//        4、不断的获取元素内容，当元素是one时，就删除改元素
        iterator = c1.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if ("one".equals(obj)) {
                iterator.remove();
            }


        }
        System.out.println("删除后的集合是" + c1);           //删除后的集合是[2, Person{name='张飞', age=30}]

        System.out.println("--------------------------------------------");
//        5、使用for each方法实现数组中的遍历，代码简单方法灵活
        for (Object obj : c1
        ) {
            System.out.println(obj);
        }
//        5、数组打印
        int[] itArr = new int[]{2, 5, 1, 5, 2345, 7};

        for (Object obj : itArr
        ) {
            System.out.println("数组打印内容" + obj);
        }

    }
}
