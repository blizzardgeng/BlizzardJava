package 多态和特殊类;

public class SubAbstractTest2 extends AbstractTest{
    @Override
    public void show() {
        System.out.println("被迫重写，不然也会变成抽象类222");
    }

    public void test() {
        System.out.println("私有方法");
    }
}
