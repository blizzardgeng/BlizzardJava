package 多线程.生产者消费者.基本写法;

/**
 * 生产者线程
 */
public class ProduceThread extends Thread {

    //声明一个仓库类型的引用作为一个成员变量。是为了调用仓库类中的生产方法。合成复用原则
    private StoreHouse storeHouse;

    //为了线程确保公用同一个仓库
    public ProduceThread(StoreHouse storeHouse) {
        this.storeHouse = storeHouse;
    }

    @Override
    public void run() {
        while (true) {
            storeHouse.produceProduct();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
