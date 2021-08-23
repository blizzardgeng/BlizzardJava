package static关键字和继承.单利模式;

/**
 * @author Administrator
 */
public class SimpleInterestOneTest {

    public static void main(String[] args) {
        SimpleInterestOne s1 = SimpleInterestOne.getInstance();
        SimpleInterestOne s2 = SimpleInterestOne.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1== s2);

    }
}
