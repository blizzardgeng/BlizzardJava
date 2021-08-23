package 多态和特殊类.内部类;

/**
 * @ClassName NormalOuterTest
 * @Description NormalOuter类的测试
 * @Author Kevin
 * @Date 2021/6/16 10:56 下午
 */
public class NormalOuterTest {

    public static void main(String[] args) {

        //1、声明NormalOuter类型的应用指向NormalOuter
        NormalOuter no = new NormalOuter();
        //2、声明NormalOuter的引用指向内部类的对象
        NormalOuter.NormalInner ni = no.new NormalInner();
        //3、调用show方法
        ni.show();
        ni.show2(4);
    }

}
