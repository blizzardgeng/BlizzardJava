package 多线程.线程.匿名内部类线程;

public class ThreadNoNameTest {
    public static void main(String[] args) {
        //匿名内部类语法格式：父类/接口类型 引用变量名 = new 父类/接口类型() {方法的重写};
//        1、方式一：使用继承家匿名内部类的方式创建并启动
//        Thread t1 = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("张三说：在吗");
//
//            }
//        };
//        t1.start();
        //方法一优化
        new Thread() {
            @Override
            public void run() {
                System.out.println("张三说：在吗");

            }
        }.start();


//        2、方式二：使用实现接口加匿名内部类的方式创建并启动
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("李四说：不在");
//            }
//        };
//        Thread t2 = new Thread(r1);
//        t2.start();
//        方法二优化1
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("李四说：不在");
//            }
//        }).start();

//        方法二优化2
        Runnable runnable = () -> System.out.println("李四说：不在");
        new Thread(runnable).start();

//        new Thread(() -> System.out.println("李四说：不在")).start();

    }
}
