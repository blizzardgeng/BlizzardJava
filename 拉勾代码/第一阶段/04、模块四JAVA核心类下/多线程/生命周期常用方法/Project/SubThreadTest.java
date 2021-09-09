package 多线程.生命周期常用方法.Project;

public class SubThreadTest {

    public static void main(String[] args) {

        SubThread1 s1 = new SubThread1();
        SubThread2 s2 = new SubThread2();
        s1.start();
        s2.start();
        try {
            s1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            s2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
