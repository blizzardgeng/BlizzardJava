package 第一阶段.模块二面向对象.方法和封装.方法的重载;

public class OverloadTest {

    void show() {
        System.out.println("show()");
    }

    void show(int i) { //体现参数长度不同
        System.out.println("shou(int)");
    }

    void show(int i, double d) { //体现参数长度不同
        System.out.println("shou(int,double)");
    }

    void show(int i, String s) { //体现参数类型不同
        System.out.println("shou(int,String)");
    }

    public static void main(String[] args) {
        OverloadTest o1 = new OverloadTest();
        o1.show();

        OverloadTest o2 = new OverloadTest();
        o2.show(6);

        OverloadTest o3 = new OverloadTest();
        o2.show(6, 3.14);

        OverloadTest o4 = new OverloadTest();
        o2.show(6, "哈哈");


    }
}
