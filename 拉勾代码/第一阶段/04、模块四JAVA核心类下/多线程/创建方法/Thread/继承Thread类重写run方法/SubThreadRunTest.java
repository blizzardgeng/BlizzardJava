package 多线程.创建方法.Thread.继承Thread类重写run方法;

public class SubThreadRunTest {

    public static void main(String[] args) {
//        1、声明Thread类型的对象指向子类类型的引用
        Thread t1 = new SubThreadRun();
//        2、调用run方法测试，重写run方法后，执行需要调用start方法
        //调用run方法相当于普通方法的调用，执行流程就是run方法执行结束后向后执行
//        t1.run();
        //调用start方法相当于又启动了一个线程，加上main上的方法一共是2个线程
        t1.start();

        for (int i = 1; i <= 30; i++) {
            System.out.println("----------------------main方法中i的值是"+i);

        }
    }
}
