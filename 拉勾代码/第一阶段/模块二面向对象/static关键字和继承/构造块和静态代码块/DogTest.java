package 第一阶段.模块二面向对象.static关键字和继承.构造块和静态代码块;

/**
 * @author : Kevin Geng
 * @ClassName ：DogTest
 * @date : 2021/6/4 11:58 下午
 */
public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.show();
        Dog d2 = new Dog("阿黄", "黄色", 18);
        d2.show();
    }
}
