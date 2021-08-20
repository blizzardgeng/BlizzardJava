package 第一阶段.模块二面向对象.static关键字和继承.单利模式;

/**
 * @author Administrator
 */
public class SimpleInterestTwoTest {

    public static void main(String[] args) {
        SimpleInterestTwo s1 = SimpleInterestTwo.getInstance();
        SimpleInterestTwo s2 = SimpleInterestTwo.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);
    }
}
