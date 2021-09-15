package 新特性.Stream类;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListPersonTest {
    public static void main(String[] args) {


//        1、准备一个list集合并放入Person类型的对象并打印
        List<Person> list = new LinkedList<>();
        list.add(new Person("张飞", 30));
        list.add(new Person("小乔", 17));
        list.add(new Person("周瑜", 20));
        list.add(new Person("关羽", 35));
        list.add(new Person("刘备", 40));
        for (Person p : list
        ) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------------------------");
//        2、将List中的成年人过滤出来并放到另外一个集合并打印
        List<Person> list1 = new LinkedList<>();
        for (Person p : list
        ) {
            if (p.getAge() >= 18) {
                list1.add(p);
            }
        }

        for (Person p : list1
        ) {
            System.out.println(p);
        }
        System.out.println("---------------------------------------------------------");

//        3、使用Stream接口实现上诉功能
        list.stream().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        }).forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });
        System.out.println("---------------------------------------------------------==");
//        4、使用lambda表达式简化代码
//        list.stream().filter((person -> person.getAge() >= 18)).forEach(person -> System.out.println(person));
        list.stream().filter((person -> person.getAge() >= 18)).forEach(System.out::println);

        System.out.println("---------------------------------------------------------==");
//        去重
        list.stream().distinct().forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });
        System.out.println("---------------------------------------------------------==");

//        获取指定长度的参数
        list.stream().limit(3).filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        }).forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });

        list.stream().limit(3).filter(person -> person.getAge() >= 18).forEach(System.out::println);

        System.out.println("---------------------------------------------------------==");

//        丢弃前面n个元素
        list.stream().skip(2).distinct().filter(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18;
            }
        }).forEach(new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println(person);
            }
        });

        //        使用lambda表达式简化代码
        list.stream().skip(2).distinct().filter(person -> person.getAge() >= 18).forEach((System.out::println));

        System.out.println("---------------------------------------------------------==");
//        跳过2个元素在过去三个元素
        list.stream().skip(2).limit(3).filter(person -> person.getAge() >= 18).forEach(person -> System.out.println(person));




    }
}
