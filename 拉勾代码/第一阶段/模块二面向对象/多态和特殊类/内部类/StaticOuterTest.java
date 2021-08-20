package 多态和特殊类.内部类;

/**
 * @ClassName StaticOuterTest
 * @Description StaticOuter类的测试
 * @Author Kevin
 * @Date 2021/6/17 10:58 下午
 */
public class StaticOuterTest {

    public static void main(String[] args) {
//        1、声明StaticInner类型引用指向该类型对象
        StaticOuter.StaticInner sa = new StaticOuter.StaticInner();
//        2、调用show方法测试
        sa.show();
        System.out.println("---------");
        sa.show2(5);

    }

}
