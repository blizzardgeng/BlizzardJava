package 第一阶段.模块二面向对象.多态和特殊类.枚举;

/**
 * @ClassName Demo
 * @Description 单例模式
 * @Author Kevin
 * @Date 2021/6/18 11:20 下午
 */
public class Demo {


    private static Demo p1 = new Demo();

    private Demo() {
        System.out.println("调用构造方法");
    }

    public static Demo getObj() {
        return p1;
    }

}
