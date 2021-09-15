package 新特性.方法的引用.对象的非静态方法引用;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MethodReferenceTest {

    public static void main(String[] args) {
//        一、无参无返回值
//        1.使用匿名内部类的方式通过图数式接口Runnable中的方法实现对Person类中show方法的调用
        Person person = new Person("张飞", 30);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                person.show();
            }
        };

        runnable.run();
        System.out.println("-------------------------------------------------------");
//        2.使用Lambda表达式的方式实现Person类中show方法的调用
        Runnable runnable1 = () -> person.show();

        runnable1.run();
        System.out.println("-------------------------------------------------------");
//        3、使用方法引用的方式实现person类中show方法的调用
        Runnable runnable2 = person::show;
        runnable2.run();

//        二、无参有返回值方法
//        1、匿名函数类
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return person.getName();
            }
        };
        System.out.println(supplier.get());
        //        2.使用Lambda表达式的方式实现Person类中show方法的调用
        Supplier supplier1 = () -> person.getName();
        System.out.println(supplier1.get());

        //        3、使用方法引用的方式实现person类中show方法的调用
        Supplier supplier2 = person::getName;
        System.out.println(supplier2.get());
//        三、有参没有返回值
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                person.setName(s);
            }
        };
        consumer.accept("刘德华");
        System.out.println("匿名内部类修改后的名称是"+person.getName());
        //        2.使用Lambda表达式的方式实现Person类中show方法的调用
        Consumer<String> consumer1 = o -> person.setName(o);
        consumer1.accept("关羽");
        System.out.println("lambda表达式修改后的名称是"+person.getName());
        //        3、使用方法引用的方式实现person类中show方法的调用
        Consumer<String> consumer2 = person::setName;
        consumer2.accept("刘备");
        System.out.println("方法引用式修改后的名称是"+person.getName());


    }
}
