package 多线程.线程.生命周期.守护线程;

public class ThreadDaemonTest extends Thread {
    @Override
    public void run() {
        System.out.println(isDaemon() ? "当前线程是守护线程":"不是守护线程");
        System.out.println("---");
        //子线程不是守护线程，虽然主线程结束了但是子线程依然会继续执行直到结束
        //子线程是守护线程时候，当主线程结束后，子线程跟着结束
        for (int i = 1; i < 50; i++) {
            System.out.println("子线程i = "+i);

        }


    }

    public static void main(String[] args) {
        ThreadDaemonTest tdt = new ThreadDaemonTest();
        //必须在线程启动之前设置为守护线程
        tdt.setDaemon(true);

        tdt.start();
        for (int i = 1; i < 20; i++) {
            System.out.println("--------------------主线程i = "+i);

        }
    }
}
