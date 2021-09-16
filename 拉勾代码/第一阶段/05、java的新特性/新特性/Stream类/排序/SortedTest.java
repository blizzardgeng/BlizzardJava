package 新特性.Stream类.排序;



import java.util.LinkedList;
import java.util.List;

public class SortedTest {

    public static void main(String[] args) {
//        自然排序并打印
        //        1、准备一个list集合并放入Person类型的对象并打印
        List<Person> list = new LinkedList<>();
        list.add(new Person("张飞", 30));
        list.add(new Person("小乔", 17));
        list.add(new Person("周瑜", 20));
        list.add(new Person("关羽", 35));
        list.add(new Person("刘备", 40));

        list.stream().sorted().forEach(System.out::println);



    }

}
