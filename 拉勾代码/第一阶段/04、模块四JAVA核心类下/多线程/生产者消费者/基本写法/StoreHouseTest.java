package 多线程.生产者消费者.基本写法;

public class StoreHouseTest {
    public static void main(String[] args) {
//        1、创建仓库对象
        StoreHouse sd = new StoreHouse();
//        2、创建消费者和生产者对象
        ProduceThread pt = new ProduceThread(sd);
        ConsumerThread ct = new ConsumerThread(sd);

        pt.start();
        ct.start();

    }
}
