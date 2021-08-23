package static关键字和继承.构造块和静态代码块;

/**
 * @author : Kevin Geng
 * @ClassName ：BlockTest
 * @date : 2021/6/1 10:38 下午
 */
public class BlockTest {



//    当需要在执行构造体之前做一些准备工作时候，代码写入到这里即可,比如对成员变量统一初始化    2
    {
        System.out.println("构造块");

    }
//    静态代码卡会根据类的加载运行一次,比构造块先执行     1
//    当需要执行代码块之前随着类加载需要做一些准备工作时候，就可以写在这里。比如加载数据库的驱动包
    static {
        System.out.println("--静态代码块");
    }

    //    自定义构造方法    3
    public BlockTest() {
        System.out.println("==构造方法体");
    }

    public static void main(String[] args) {
        BlockTest b1 = new BlockTest();
        BlockTest b2 = new BlockTest();
    }
}
