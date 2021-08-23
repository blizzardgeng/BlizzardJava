package static关键字和继承.构造块和静态代码块;

/**
 * @author : Kevin Geng
 * @ClassName ：PerpleTest
 * @date : 2021/6/1 9:30 下午
 */
public class PeopleTest {
    public static void main(String[] args) {
//        验证static修饰的类成员是否跟创建无关
        System.out.println("获取到的国籍是"+ People.getCountries());
        System.out.println("获取到的国籍是"+ People.getCountries());

        People p1 = new People("张三",-5);
        People p2 = new People("李四",6);
        p1.show();
        p2.show();
        System.out.println("------------------");

//        验证static是否所有对象共享
        People.setCountries("伊拉克");
        System.out.println("p1对象国家是"+ People.getCountries());
        System.out.println("p2对象国家是"+ People.getCountries());
    }
}
