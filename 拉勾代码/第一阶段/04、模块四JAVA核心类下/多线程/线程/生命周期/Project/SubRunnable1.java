package 多线程.线程.生命周期.Project;

public class SubRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("线程1输出" + i);
            }
        }
    }
}
