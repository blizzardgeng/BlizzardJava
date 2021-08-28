package 集合类.collection类;


import 多态和特殊类.内部类.StaticOuter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {

//        1、准备一个collection集合并打印
        //Collection c1 = new Collection(); //接口不能实例化
        //接口类型的引用指向实现类的对象，形成多态
        //自动调用ArrayList中的toString方法，多态，编译阶段调父类，运行阶段调子类，默认打印[元素1，元素2.....]
        Collection c1 = new ArrayList();
        System.out.println("集合中的元素有" + c1);
//        2、在集合中添加单个元素并打印
        boolean b1 = c1.add("one");
        System.out.println(b1);
        System.out.println(c1);         //[one]
        b1 = c1.add(Integer.valueOf(2));
        System.out.println(b1);
        System.out.println(c1);         //[one, 2]
        b1 = c1.add(new Person("张飞", 30));
        System.out.println(b1);
        // 打印集合中所有元素的时候，本质上是打印集合中的每个对象，也就是让每个对象调用自己的toString方法
        System.out.println(c1);         //[one, 2, Person{name='张飞', age=30}]

        System.out.println("-----------------------------------------------------------------");
//        3、在集合中添加多个元素并打印
        Collection c2 = new ArrayList();
        c2.add("three");    //常量池
        c2.add(4);          //自动装箱机制
        System.out.println("c2=" + c2);         //c2=[three, 4]
        //将c2中的元素添加到c1中,也就是将c2中的元素在尾部一个一个添加到c1中
        b1 = c1.addAll(c2);

        System.out.println(b1);
        System.out.println(c1);         //[one, 2, Person{name='张飞', age=30}, three, 4]

        System.out.println("-----------------------------------------------------------------");
//        4、判断集合中是否包含的单个元素
        b1 = c1.contains(new String("one"));
        System.out.println("b1 = " + b1);         //b5 = true

        b1 = c1.contains(new String("two"));
        System.out.println("b1 = " + b1);         //b5 = false

        b1 = c1.contains(Integer.valueOf(2));
        System.out.println("b1 = " + b1);         //b5 = true

        b1 = c1.contains(Integer.valueOf(3));
        System.out.println("b1 = " + b1);         //b5 = false
        //contains工作原理是调用：Objects.equals(o,e)，其中o是contains方法中的形式参数，而e代表所有每个元素
        //contains工作原理是拿着参数对象与集合中已有的元素依次进行比较，比较的方式用Objects的equals方法
        // 而该方法工作原理如下：
       /*
        public static boolean equals(Object a, Object b) {  其中a代表Person对象，b代表集合中已有的对象
            return (a == b) || (a != null && a.equals(b));
            元素存在包含第一种方式就是：Person对象跟集合中已有对象的地址相同
                        第二种方式是：Person对象部位空，则Person对象调用equals方法与集合中已有的元素相等
        }
        */
        //当Person类中没有重写equals方法，则调用Object类中继承下来的equals方法，比较地址,false
        //当person类中重写了equals方法，则比较的是内容，true
        b1 = c1.contains(new Person("张飞", 30));
        System.out.println("b1 = " + b1);         //b5 = false

        System.out.println("-----------------------------------------------------------------");
        System.out.println(c1);
//        5、判断当前几个中是否包含参数指定集合的所有元素
        //只有c1中包含c3的所有元素，才会返回true
        Collection c3 = new ArrayList();
        c3.add(4);
        System.out.println("c3 = " + c3);
        b1 = c1.containsAll(c3);
        System.out.println(b1);            //true

        c3.add("five");
        b1 = c1.containsAll(c3);
        System.out.println(b1);            //false

        System.out.println("-----------------------------------------------------------------");

//        6、计算两个集合的交集并保留到集合中打印
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        b1 = c2.retainAll(c2);
        System.out.println("b1 =" + b1);
        System.out.println(c2);

        b1 = c2.retainAll(c3);
        System.out.println("b1 = " + b1);
        System.out.println(c2);

        System.out.println("-----------------------------------------------------------------");
//        7、实现集合中单个
        //remove工作原理还是调用Object.equals
        System.out.println(c1);     //[one, 2, Person{name='张飞', age=30}, three, 4]
        b1 = c1.remove(1);
        System.out.println(b1);
        b1 = c1.remove("one");
        System.out.println(b1);
        System.out.println(c1);
        b1 = c1.remove(new Person("张飞", 30));
        System.out.println(b1);
        System.out.println(c1);

        System.out.println("-----------------------------------------------------------------");
//        8、实现集合中所有元素的值
//        删除所有元素本质上是一个一个删除
        System.out.println("c3 = " + c3);
        //从c1中删除元素c3的所有数值
        c1.removeAll(c3);
        System.out.println(c1);

        System.out.println("-----------------------------------------------------------------");
//        9、实现集合中其他方法
        System.out.println("c1集合中元素的个数是" + c1.size());
        System.out.println(0 == c1.size() ? "集合为空" : "集合不为空");
        System.out.println(c1.isEmpty() ? "集合已经空了" : "集合还没空");
        //清空集合中的所有元素
        c1.clear();
        System.out.println("c1集合中元素的个数是" + c1.size());
        System.out.println(0 == c1.size() ? "集合为空" : "集合不为空");
        System.out.println(c1.isEmpty() ? "集合已经空了" : "集合还没空");

        //准备两个集合判断是否相等
        Collection c4 = new ArrayList();
        c4.add(1);
        c4.add(2);
        Collection c5 = new ArrayList();
        c5.add(1);
        c5.add(2);

        System.out.println(c4.equals(c5));
        System.out.println("-----------------------------------------------------------------");
//        10、实现集合和数组之间的转换
        Object[] objects = c5.toArray();
        System.out.println("数组元素有"+Arrays.toString(objects));
        //实现数组到集合的转换
        Collection list = Arrays.asList(objects);
        System.out.println("集合中的元素有"+list);


    }

}
