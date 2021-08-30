package 集合类下.泛型机制.泛型类的继承;

import java.util.ArrayList;
import java.util.List;

public class SubPersonTest {
    public static void main(String[] args) {
        //      1.声明subPerson类型的引用指向SubPerson类型的对象并调用set方法进行测计

//        SubPerson<String> sp1 = new SubPerson();     //Error SubPerson类中不支持泛型
        SubPerson sp1 = new SubPerson();

        System.out.println("------------------------------");
//        SubPerson<String> sp2 = new SubPerson<>();
        SubPerson<String, String> sp2 = new SubPerson<>();
        sp2.setGender("女");





    }

}
