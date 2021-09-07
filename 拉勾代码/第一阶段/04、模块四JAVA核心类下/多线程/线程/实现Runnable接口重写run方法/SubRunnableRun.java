package 多线程.线程.实现Runnable接口重写run方法;

public class SubRunnableRun implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("run方法中i的值是"+i);

        }
    }
}
