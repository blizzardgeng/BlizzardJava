package 多线程.创建方法.Callable接口;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        //计算·1-10000之间的累加和并打印返回
        int con = 0;
        for (int i = 1; i <= 10000; i++) {

            con += i;

        }
        System.out.println("计算的累加和是" + con);

        return con;

    }

    public static void main(String[] args) {
        ThreadCallableTest tct = new ThreadCallableTest();
        FutureTask ft = new FutureTask(tct);
        Thread t1 = new Thread(ft);
        t1.start();
        Object object = null;
        try {
            object = ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("接收到的返回值是"+object);
    }
}
