package 新特性.方法的引用.类的静态方法引用;

import 新特性.方法的引用.对象的非静态方法引用.Person;

import javax.swing.*;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    private static Function<String, Integer> function2;

    public static void main(String[] args) {

//        一、使用匿名内部类的方式通过函数接口Function中的方法实现Integer中的parseInt方法的调用
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };
        System.out.println(function.apply("1234"));
        //        2.使用Lambda表达式的方式
        Function<String, Integer> function1 = o -> Integer.parseInt(o);
        System.out.println(function1.apply("2345"));
        //        3、使用方法引用的方式实现person类中show方法的调用
        Function<String, Integer> function2 = Integer::parseInt;
        function2.apply("4567");

//        二、使用匿名内部类的方式通过函数式Comparator中的方法实现Integer类中compare方法的调用
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        System.out.println(comparator.compare(10, 20));
        //        2.使用Lambda表达式的方式
        Comparator<Integer> comparator1 = (o1,o2) -> Integer.compare(o1,o2);
        System.out.println(comparator1.compare(10, 20));
        //        3、使用方法引用的方式实现
        Comparator<Integer> comparator2 = Integer::compare;
        System.out.println(comparator2.compare(10, 20));
        System.out.println("-------------------------------------------------------");
//        使用匿名内部类的方式通过类名来调用非静态方法
        //要求：其中一个参数对象对为调用对象来调用方法，
        Comparator<Integer> comparator3 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        comparator3.compare(10, 20);
        //        2.使用Lambda表达式的方式
        Comparator<Integer> comparator4 = (o1, o2) -> o1.compareTo(02);
        comparator4.compare(10, 20);
        //        3、使用方法引用的方式实现
        Comparator<Integer> comparator5 = Integer::compareTo;
        comparator5.compare(10, 20);


    }
}
