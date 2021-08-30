package 集合类下.泛型机制.泛型的通配符使用;

import java.util.LinkedList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
//        1、通配符作为公共父类
        List<Animal> lt1 = new LinkedList<>();
        List<Dog> lt2 = new LinkedList<>();

        List<?> lt3 = new LinkedList<>();
        System.out.println("------------------------------------------------");
//        2、向公共父类中添加和获取元素
//        lt3.add(new Animal());        //Error 不能存放Animal 类
//        lt3.add(new Dog());        //Error 不能存放Dog 类      不支持元素添加操作

        Object o = lt3.get(0);      //支持元素获取方法

        System.out.println("------------------------------------------------");
        List<? extends Animal> lt4 = new LinkedList<>();
//        lt4.add(new Animal());        错误
//        lt4.add(new Dog());           错误
//        获取元素
        Animal animal = lt4.get(0);
        System.out.println("------------------------------------------------");
        List<? super Animal> lt5 = new LinkedList<>();
        lt5.add(new Animal());
        lt5.add(new Dog());

        Object object = lt5.get(0);


    }
}
