package 多线程.创建方法.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {

//        1、创建一个线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        2、在线程池中发布任务
        executorService.submit(new ThreadCallableTest());
//        3、关闭线程池
        executorService.shutdown();

    }
}

