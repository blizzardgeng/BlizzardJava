package 多线程.线程.生命周期.Project;

public class SubThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("线程2输出"+i);
            }

        }
    }
}
