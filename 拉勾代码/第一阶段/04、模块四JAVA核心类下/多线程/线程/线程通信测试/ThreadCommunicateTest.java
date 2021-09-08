package 多线程.线程.线程通信测试;

public class ThreadCommunicateTest implements Runnable{

    private int cnt = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (cnt <= 100) {
                    System.out.println("线程" + Thread.currentThread().getName() + "打印，内容是" + cnt);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cnt += 1;

                } else {
                    break;

                }
            }
        }
    }


    public static void main(String[] args) {
        ThreadCommunicateTest tct = new ThreadCommunicateTest();
        Thread t1 = new Thread(tct, "张飞");
        Thread t2 = new Thread(tct, "关羽");

        t1.start();

        t2.start();

    }

}
