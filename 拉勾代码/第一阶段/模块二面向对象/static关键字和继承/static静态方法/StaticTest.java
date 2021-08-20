package static关键字和继承.static静态方法;

/**
 * @author : Kevin Geng
 * @ClassName ：StaticTest
 * @date : 2021/6/1 9:52 下午
 */
public class StaticTest {

    private int cnt = 1;//属于对象层，每个对象都独立一份
    private static int snt = 2;//属于类层级，每个对象都共享一份

//    自定义非静态的成员方法需要使用引用.的方式访问
    void show() {
        System.out.println("cot = "+cnt);
        System.out.println("sot = "+snt);
    }

    //    自定义静态成员方法，推荐使用类目.的方式访问
    public static void test() {
//        System.out.println("cot = "+cnt);  //静态成员方法中，没有this对象因为是通过类名.访问
        System.out.println("sot = "+snt);
    }


    public static void main(String[] args) {
        StaticTest s1 = new StaticTest();
        s1.show();
        System.out.println("------------------");
        StaticTest.test();

    }
}
