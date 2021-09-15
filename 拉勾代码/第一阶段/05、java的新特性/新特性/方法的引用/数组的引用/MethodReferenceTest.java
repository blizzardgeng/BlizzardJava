package 新特性.方法的引用.数组的引用;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    private static Function<String, Integer> function2;

    public static void main(String[] args) {
//        使用匿名内都类的方式通过Function图数式接口创建指定数量的Person类型的对象数组并返回
        Function<Integer, Person[]> function = new Function<Integer, Person[]>() {
            @Override
            public Person[] apply(Integer integer) {
                return new Person[integer];
            }
        };
        Person[] apply = function.apply(3);
        System.out.println(Arrays.toString(apply));
        //        2.使用Lambda表达式的方式
        Function<Integer, Person[]> function1 = integer -> new Person[integer];
        Person[] apply1 = function1.apply(3);
        System.out.println(Arrays.toString(apply1));
        //        3、使用方法引用的方式实现
        Function<Integer, Person[]> function3 = Person[]::new;
        Person[] apply2 = function3.apply(3);
        System.out.println(Arrays.toString(apply2));

    }
}
