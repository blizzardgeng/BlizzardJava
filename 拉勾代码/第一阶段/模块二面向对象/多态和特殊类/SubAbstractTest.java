package 多态和特殊类;

public class SubAbstractTest extends AbstractTest {

    @Override
    public void show() {
        System.out.println("被迫重写，不然也会变成抽象类");
    }

    public static void main(String[] args) {
        //1、声明本类类型的引用指向本类类型对象,没有多态
        SubAbstractTest sat = new SubAbstractTest();
        sat.show();
        System.out.println("-------------------");
        //2、声明AbstractTest类型的引用指向子类对象，使用了多态
        //多态使用场合2：直接在方法体中使用抽类的引用指向子类类型的对
//        AbstractTest as2 = new SubAbstractTest();
//        as2.show();
        System.out.println("-----------");
        AbstractTest as2 = new SubAbstractTest2();
        as2.show();

        ((SubAbstractTest2) as2).test();
    }
}
