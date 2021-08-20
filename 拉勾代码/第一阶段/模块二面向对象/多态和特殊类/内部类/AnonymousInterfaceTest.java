package 多态和特殊类.内部类;

/**
 * @ClassName AnonymousInterfaceTest
 * @Description AnonymousInterface接口测试类
 * @Author Kevin
 * @Date 2021/6/18 9:37 下午
 */
public class AnonymousInterfaceTest {

    //假设有下面方法
//    AnonymousInterface ai = new AnonymousInterfaceImpl()
//    接口类型的引用指向实现类型的对象,形成了多态
    public static void test(AnonymousInterface anonymousInterface) {
        //编译阶段调用父类，运行调用实现类重写的版本
        anonymousInterface.show();
    }

    public static void main(String[] args) {
//        AnonymousInterfaceTest.test(new AnonymousInterface);  错误
        AnonymousInterfaceTest.test(new AnonymousInterfaceImpl());
        System.out.println("--------------");
        AnonymousInterface ai2 = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("匿名实现类");
            }
        };

        AnonymousInterfaceTest.test(ai2);

        //从java8以后提出新特性lamda表达式,可以减少上诉代码，格式：（参数列表）-> {方法体},调用方法没有参数时候()内不填写，方法提只有一句语句时候，{}可以不用写
        AnonymousInterface ai3 = () -> System.out.println("lamda表达式这样");
        AnonymousInterfaceTest.test(ai3);
    }

}
