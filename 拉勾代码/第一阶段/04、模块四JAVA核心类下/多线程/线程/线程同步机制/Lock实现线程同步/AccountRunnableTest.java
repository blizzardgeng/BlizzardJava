package 多线程.线程.线程同步机制.Lock实现线程同步;

import java.util.concurrent.locks.ReentrantLock;

public class AccountRunnableTest implements Runnable {

    private ReentrantLock lock = new ReentrantLock();           //准备了一把锁

    private int balance;  //描述银行账户余额

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public AccountRunnableTest() {
    }

    public AccountRunnableTest(int balance) {
       setBalance(balance);
    }



    @Override
    public /*synchronized*/ void run() {

//        加锁
        lock.lock();

//        synchronized (this) {
            System.out.println("线程启动，名称是"+Thread.currentThread().getName());
//        1、模拟从后台查询余额的过程
            int temp = getBalance();

//        2、模拟取款
            if (temp >= 200) {
                System.out.println("正在出钞，请稍后");
                temp -= 200;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("请取走钱");
            } else {
                System.out.println("余额不足请核对余额");
            }

//        3、模拟写入最新余额
            setBalance(temp);
//        }
//        解锁
             lock.unlock();

    }

    public static void main(String[] args) {
        AccountRunnableTest art = new AccountRunnableTest(1000);

        Thread t1 = new Thread(art);
        Thread t2 = new Thread(art);
        t1.start();
        t2.start();

        System.out.println("主线程等待");
        try {
            t1.join();

            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("最终余额是"+art.getBalance());

    }
}

