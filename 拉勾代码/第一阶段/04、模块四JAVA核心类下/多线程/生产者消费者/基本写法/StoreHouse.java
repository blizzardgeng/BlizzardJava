package 多线程.生产者消费者.基本写法;

/**
 * 仓库类
 */
public class StoreHouse {
    private int cnt = 0; //记录商品的数量


    public synchronized void produceProduct() {
        notify();
        if (cnt < 10) {
            System.out.println("线程" + Thread.currentThread().getName() + ",正在生产" + (cnt + 1) + "个产品");
            cnt++;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public synchronized void ConsumerProduct() {
        notify();
        if (cnt > 0) {
            System.out.println("线程" + Thread.currentThread().getName() + "正在消费第" + cnt + "个产品");
            cnt--;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
