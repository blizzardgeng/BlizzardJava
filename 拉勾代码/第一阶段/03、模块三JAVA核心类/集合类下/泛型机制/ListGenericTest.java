package 集合类下.泛型机制;

import java.util.LinkedList;
import java.util.List;

public class ListGenericTest {

    public static void main(String[] args) {
//        1、准备一个支持泛型机制的list,明确要求集合中的元素是String
        List<String> lt1 = new LinkedList<String>();
//        2、往集合中添加元素
        lt1.add("one");
        System.out.println("lt1 = "+lt1);
//        3、获取集合中的元素
        String str = lt1.get(0);
        System.out.println("获取到的元素是"+str);
        System.out.println("---------------------------------------------------");
//        2、准备一个支持Integer类型的List集合
        List<Integer> lt2 = new LinkedList<Integer>();
        lt2.add(2);
        lt2.add(1);

        System.out.println("lt2 = "+lt2);
        System.out.println("---------------------------------------------------");
//        java 7开始的新特性，菱形特性
        List<Double> lt3 = new LinkedList<>();




    }
}
