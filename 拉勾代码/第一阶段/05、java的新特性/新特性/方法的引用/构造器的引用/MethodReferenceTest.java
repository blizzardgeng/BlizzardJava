package 新特性.方法的引用.构造器的引用;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest {

    private static Function<String, Integer> function2;

    public static void main(String[] args) {

//        使用匿名内部类的方式通过Supplier函数式接口创建Person类型的对象并返回
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return new Person();
            }
        };
        System.out.println(supplier.get());
        //        2.使用Lambda表达式的方式
        Supplier supplier1 = () -> new Person();
        System.out.println("lambda表达式结果"+supplier1.get());
        //        3、使用方法引用的方式实现
        Supplier supplier2 = Person::new;
        System.out.println("方法的引用" + supplier.get());

        //        使用匿名内部类的方式通过BiFunction函数式接口创建Person类型的有参对象并返回、
        System.out.println("-------------------------------------------------------");

        BiFunction<String, Integer, Person> biFunction = new BiFunction<String, Integer, Person>() {
            @Override
            public Person apply(String s, Integer integer) {
                return new Person(s, integer);
            }
        };
        System.out.println(biFunction.apply("刘备", 50));

        //        2.使用Lambda表达式的方式
        BiFunction<String, Integer, Person> biFunction1 = (o1, o2) -> new Person(o1, o2);
        System.out.println(biFunction1.apply("耿旭东", 100));
        //        3、使用方法引用的方式实现
        BiFunction<String, Integer, Person> biFunction2 = Person::new;
        System.out.println(biFunction2.apply("彭涛", 20));
        System.out.println("-------------------------------------------------------");
//        使用匿名内部类的方式通过Function函数式接口创建指定数量的Person类型的对象数组并返回


    }
}
