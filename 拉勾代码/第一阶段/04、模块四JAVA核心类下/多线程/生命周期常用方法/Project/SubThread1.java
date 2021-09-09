package 多线程.生命周期常用方法.Project;

public class SubThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("线程1输出"+i);
            }

        }
    }


}
