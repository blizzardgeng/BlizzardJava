package 多线程.创建方法.Thread.无参构造Thread;

public class ThreadTest {
    public static void main(String[] args) {
//        1、使用无参方式构建Thread对象
        //由源码可以知道Thread中成员变量target的值是null
        Thread t1 = new Thread();
//        2、对run方法进行测试
        //由源码可以知道，target的值是null，所以条件不成立，跳过{}中的代码。可以证明无参构造方法的Thread类什么事也不做

        t1.run();
        System.out.println("测试结束");

    }
}
