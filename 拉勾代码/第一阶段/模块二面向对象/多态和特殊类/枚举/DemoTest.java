package 第一阶段.模块二面向对象.多态和特殊类.枚举;

/**
 * @ClassName DemoTest
 * @Description demo测试代码
 * @Author Kevin
 * @Date 2021/6/18 11:25 下午
 */
public class DemoTest {
    public static void main(String[] args) {
        Demo d1 = Demo.getObj();
        Demo d2 = Demo.getObj();

        System.out.println(d1 == d2);

    }

}
