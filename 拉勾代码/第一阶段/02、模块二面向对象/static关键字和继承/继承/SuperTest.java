package static关键字和继承.继承;

/**
 * @author : Kevin Geng
 * @ClassName ：SuperTest
 * @date : 2021/6/5 12:03 上午
 */
public class SuperTest {

    {
        System.out.println("SuperTest构造块");
    }

    static {
        System.out.println("SuperTest静态块");
    }

    public SuperTest() {
        System.out.println("SuperTest构造方法");
    }

    public static void main(String[] args) {
        SuperTest st = new SuperTest();
    }
}
