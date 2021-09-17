package 新特性.Stream类.终止操作;



import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TerminationTest {
    public static void main(String[] args) {

//        1、准备一个list集合并放入Person类型的对象并打印
        List<Person> list = new LinkedList<>();
        list.add(new Person("张飞", 30));
        list.add(new Person("小乔", 17));
        list.add(new Person("周瑜", 20));
        list.add(new Person("关羽", 35));
        list.add(new Person("刘备", 40));


//        2、判断集合中是否没有元素的年龄是大鱼40的
        boolean b1 = list.stream().noneMatch(new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() > 10;
            }
        });
        System.out.println("b1 = " + b1);
        //        使用lambda表达式简化代码
        boolean b2 = list.stream().noneMatch(person -> person.getAge() > 10);
        System.out.println(b2);


        System.out.println("-----------------------------------");

//        3、按照比较器的规则获取集合中所有元素中的最大值
        Optional<Person> max = list.stream().max(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println("年龄最大的是" + max);
        //        使用lambda表达式简化代码
        Optional<Person> max1 = list.stream().max(((o1, o2) -> o1.getAge() - o2.getAge()));
        System.out.println(max1);


        System.out.println("-----------------------------------");
//        4、把集合中的所有年龄拿出来并进行累加
        Optional<Integer> reduce = list.stream().map(Person::getAge).reduce(new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }

        });

        System.out.println("相加结果是"+reduce);

//        Optional<Integer> reduce1 = list.stream().map(Person::getAge).reduce(((integer, integer2) -> integer + integer2));
        Optional<Integer> reduce1 = list.stream().map(Person::getAge).reduce((Integer::sum));
        System.out.println(reduce1);
        System.out.println("-----------------------------------");
//        5、实现将集合中所有元素姓名映射出来并收集到集合中打印
        list.stream().map(Person::getName).collect(Collectors.toList()).forEach(System.out::println);


    }
}
