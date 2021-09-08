package 多线程.线程.线程同步机制.同步代码块方式.继承方式;



public class AccountThreadTest extends Thread {

    private Demo dm = new Demo();

    private int balance;  //描述银行账户余额

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public AccountThreadTest() {
    }

    public AccountThreadTest(int balance) {
        setBalance(balance);
    }



    @Override
    public void run() {
        synchronized (dm) {
//        synchronized (new Demo()) {       //锁不住，必须是同一个对象
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
        }
    }

    public static void main(String[] args) {
        AccountThreadTest att1 = new AccountThreadTest(1000);
        att1.start();
        AccountThreadTest att2 = new AccountThreadTest(1000);
        att2.start();

        try {
            att1.join();

            att2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最终账户余额是"+att2.getBalance());



    }
}
class Demo{

}