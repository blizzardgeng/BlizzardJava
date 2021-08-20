package 第一阶段.模块二面向对象.方法和封装.this关键字;

/**
 * @author : Kevin Geng
 * @date : 2021/5/30 10:33 下午
 */
public class ThisTest {
    ThisTest() {
        System.out.println("构造方法中的this="+this);
    }

    void show() {
        System.out.println("成员方法方法中的this ="+this);
    }

    public static void main(String[] args) {
        ThisTest t = new ThisTest();
        System.out.println("main方法中的this ="+t);
        t.show();

    }
}
