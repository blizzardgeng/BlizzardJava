package 多线程.线程.生命周期.线程的等待;

public class ThreadJoinTest extends Thread{

    @Override
    public void run() {
        System.out.println("倒计时开始");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("倒计时结束");
    }

    public static void main(String[] args) {
        ThreadJoinTest tjt = new ThreadJoinTest();
        tjt.start();

        //主线程开始等待
        System.out.println("主线程开始等待");
        try {
            //表示当前正在执行的对象等待调用对象
//            tjt.join();
            tjt.join(5000);  //等待指定时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程结束");
    }
}
