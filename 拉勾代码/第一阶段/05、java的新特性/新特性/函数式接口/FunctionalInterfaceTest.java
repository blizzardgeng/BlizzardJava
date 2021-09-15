package 新特性.函数式接口;

import com.sun.org.apache.bcel.internal.classfile.Constant;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {




//        1、匿名内部类语法格式 = 父类/接口类型 引用变量名 = new 父类/接口类型(){  方法的重写  };
//        无参无返回值的方法
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("没有参数又没有返回值的方法");            //没有参数又没有返回值的方法
            }

        };
        runnable.run();
//        使用lambda表达式实现函数接口的创建,(参数列表) -> {方法体}；
        Runnable runnable1 = () -> System.out.println("没有参数又没有返回值的方法");
        runnable1.run();



        System.out.println("-----------------------------------------------------");
//        有参但没有返回值
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("有参但没有返回值");             //有参但没有返回值
            }
        };
        consumer.accept("友情提示");

        //        使用lambda表达式实现函数接口的创建,(参数列表) -> {方法体}；
//        Consumer consumer1 = (Object o) -> {System.out.println("有参但没有返回值");};
//        Consumer consumer1 = (o) -> System.out.println("有参但没有返回值");
        Consumer consumer1 = o -> System.out.println("有参但没有返回值");

        consumer1.accept("word");



        System.out.println("-----------------------------------------------------");

        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "无参有返回值";

            }

        };
        System.out.println(supplier.get());             //无参有返回值
        //        使用lambda表达式实现函数接口的创建,(参数列表) -> {方法体}；
//        Supplier supplier1 = () -> {return "无参有返回值";};
        Supplier supplier1 = () -> "无参有返回值";
        System.out.println(supplier1.get());


        System.out.println("-----------------------------------------------------");
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return o;
            }

        };
        System.out.println(function.apply("有参有返回值"));
        //        使用lambda表达式实现函数接口的创建,(参数列表) -> {方法体}；
        //return和{}都可以不写
        Function function1 = o -> o;
        System.out.println(function1.apply("有参有返回值的方法"));


        System.out.println("-----------------------------------------------------");
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };

        System.out.println(comparator.compare(10, 20));             //0
        //        使用lambda表达式实现函数接口的创建,(参数列表) -> {方法体}；
        Comparator comparator1 = (o1, o2) -> 0;
        System.out.println(comparator1.compare(10, 20));


        System.out.println("-----------------------------------------------------");
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };


        System.out.println(predicate.test("hello"));                //false
        //        使用lambda表达式实现函数接口的创建,(参数列表) -> {方法体}；
        Predicate predicate1 = o -> false;
        System.out.println(predicate1.test("hah"));

    }
}
