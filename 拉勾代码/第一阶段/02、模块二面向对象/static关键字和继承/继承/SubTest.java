package static关键字和继承.继承;

/**
 * @author : Kevin Geng
 * @ClassName ：SubTest
 * @date : 2021/6/5 12:05 上午
 */
public class SubTest extends SuperTest {

    {
        System.out.println("==============SubTest构造块");
    }

    static {
        System.out.println("==============SubTest静态块");
    }

    public SubTest() {
        System.out.println("==============SubTest构造方法");
    }

    public static void main(String[] args) {
        SubTest st = new SubTest();
    }
}
