package 多线程.线程.生命周期.获取id和名称.Runnable方式;

public class RunnableIdNameTest implements Runnable{
    @Override
    public void run() {
        //获取当前正在执行的线程的引用
        Thread thread1 = Thread.currentThread();

        System.out.println("子进程的id是"+thread1.getId()+",名称是"+thread1.getName());
    }

    public static void main(String[] args) {
        RunnableIdNameTest r1 = new RunnableIdNameTest();
//        Thread t1 = new Thread(r1);
        Thread t1 = new Thread(r1,"张飞");
        t1.start();

        Thread thread2 = Thread.currentThread();

        System.out.println("父进程的id是"+thread2.getId()+",名称是"+thread2.getName());


    }
}
