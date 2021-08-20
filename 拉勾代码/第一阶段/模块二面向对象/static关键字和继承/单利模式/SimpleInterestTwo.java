package 第一阶段.模块二面向对象.static关键字和继承.单利模式;

/**
 * @author Administrator
 * 单例模式--饿汉模式
 */
public class SimpleInterestTwo {
    private static SimpleInterestTwo s1 = new SimpleInterestTwo();


    public static SimpleInterestTwo getInstance() {

        return s1;
    }
}
