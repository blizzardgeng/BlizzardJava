package 多线程.线程.实现Runnable接口重写run方法;

public class SubRunnableRunTest {
    public static void main(String[] args) {
//        1、创建自定义对象，也就是实现Runnable接口类的对象
        SubRunnableRun srr = new SubRunnableRun();
//        2、使用该对象作为实参构造Thread类型对象
        //由源码可知：经过构造方法的调用之后，Thread类中的成员变量target的数值为srr。
        Thread t1 = new Thread(srr);
//        3、使用Thread类型对象调用start方法
        //若使用Runnable引用构造了线程对象，调用该方法(run )时最终调用接口中的版本
        //有run方法源码可知：srr不是null,条件成立，执行target中的run方法，最终调用接口中的run方法
        t1.start();
        for (int i = 1; i <= 30; i++) {
            System.out.println("----------------------main方法中i的值是"+i);

        }

    }
}
