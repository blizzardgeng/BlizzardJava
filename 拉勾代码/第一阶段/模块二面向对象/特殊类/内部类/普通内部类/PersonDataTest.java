package 第一阶段.模块二面向对象.特殊类.内部类.普通内部类;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/18 17:18:00
 */
public class PersonDataTest {
    public static void main(String[] args) {
//        1、声明一个PersonData类型的应用指向PersonData
        PersonData p1 = new PersonData();
//        2、声明InnerData的引用指向内部类的对象
        PersonData.InnerData i1 = p1.new InnerData();
//        3、调用show方法
        i1.show();
        System.out.println("===============");
        i1.show2();
    }
}
