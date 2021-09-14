package 多线程.创建方法.Runnable.project;

public class SubRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("子进程"+ Thread.currentThread().getName()+"运行了--------------");
    }
}
