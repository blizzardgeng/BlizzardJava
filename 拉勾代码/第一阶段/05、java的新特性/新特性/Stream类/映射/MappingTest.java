package 新特性.Stream类.映射;

import 新特性.Stream类.筛选和切片.Person;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class MappingTest {
    public static void main(String[] args) {
        //        1、准备一个list集合并放入Person类型的对象并打印
        List<新特性.Stream类.筛选和切片.Person> list = new LinkedList<>();
        list.add(new Person("张飞", 30));
        list.add(new Person("小乔", 17));
        list.add(new Person("周瑜", 20));
        list.add(new Person("关羽", 35));
        list.add(new Person("刘备", 40));


        for (Person p :list
        ) {
            System.out.println(p);
        }
        System.out.println("-------------------------------");


//        实现将集合中的年龄获取出来并打印
        list.stream().map(new Function<Person, Integer>() {
            @Override
            public Integer apply(Person person) {
                return person.getAge();
            }
        }).forEach(System.out::println);

        System.out.println("--------------------------------");
//        2.使用Lambda表达式的方式
//        list.stream().map(person -> person.getAge()).forEach(System.out::println);
        list.stream().map(Person::getAge).forEach(System.out::println);






    }
}
