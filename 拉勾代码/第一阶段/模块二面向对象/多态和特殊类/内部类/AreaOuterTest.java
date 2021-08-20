package 第一阶段.模块二面向对象.多态和特殊类.内部类;

/**
 * @ClassName AreaOuterTest
 * @Description 局部内部类测试
 * @Author Kevin
 * @Date 2021/6/18 9:18 下午
 */
public class AreaOuterTest {

    public static void main(String[] args) {
//        1、声明外部类引用指向外部类对象
        AreaOuter ar = new AreaOuter();
//        2、通过show方法调用实现局部内部类的定义和使用
        ar.show();


    }

}
