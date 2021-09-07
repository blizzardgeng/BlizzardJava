package 多线程.线程.生命周期.线程程优先级;

public class ThreePriorityTest extends Thread{
    @Override
    public void run() {
//        System.out.println("子线程的优先级是" + getPriority());            //5，普通的优先级
        for (int i = 1; i < 20; i++) {
            System.out.println("子线程i = " + i);

        }
    }

    public static void main(String[] args) {
        ThreePriorityTest tpt = new ThreePriorityTest();
        //设置子线程的优先级
        //优先级高的线程不已定先执行，但该线程获取到时间片的机会会更多一些
        tpt.setPriority(MAX_PRIORITY);
        tpt.start();
        Thread thread = Thread.currentThread();
//        System.out.println("主线程的优先级是"+thread.getPriority());            //5，普通的优先级
        for (int i = 1; i < 20; i++) {
            System.out.println("主线程i = " + i);

        }
    }
}

