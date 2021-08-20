package static关键字和继承.构造块和静态代码块;

/**
 * @author : Kevin Geng
 * @ClassName ：WorkerTest
 * @date : 2021/6/1 11:49 下午
 */
public class WorkerTest {
    public static void main(String[] args) {
//        1、声明使用无参构造worker对象
        Worker w1 = new Worker();
        /*当子类重写父类方法后，子类调用的是充血以后的版本*/
        w1.show();
        System.out.println("---------------");
        /*2、使用有参方法构造work对象并打印特征*/
        Worker w2 = new Worker("刘德华", 18, 99991);
        /*调用成员方法测试*/
        w2.show();
        w2.ect("豆芽");
        w2.play("王者");
        w2.work();
    }
}
