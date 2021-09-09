package 多线程.生命周期常用方法.获取id和名称.继承方式;

public class ThreadPerson extends Thread {


    public ThreadPerson(String name) {
        //调用父类的构造方法
        super(name);
    }

    @Override
    public void run() {
        System.out.println("子线程编号是"+this.getId());
        System.out.println("子线程名称是"+this.getName());
        this.setName("张飞");
        System.out.println("设置后的名称是" + this.getName());
    }

    public static void main(String[] args) {
        ThreadPerson tr = new ThreadPerson("关羽");
        tr.start();
        //currentThread获取当前正在运行的线程的引用
        Thread thread = Thread.currentThread();
        System.out.println("主线程编号是" + thread.getId()+",名称是"+thread.getName());


    }


}
