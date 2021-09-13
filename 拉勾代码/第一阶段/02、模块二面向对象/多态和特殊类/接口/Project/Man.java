package 多态和特殊类.接口.Project;

public class Man implements Hunter {

    @Override
    public void hunt() {
        System.out.println("正在捕猎");
    }

    @Override
    public void run() {
        System.out.println("正在奔跑");
    }

    public static void main(String[] args) {
        Runner r1 = new Man();
        r1.run();

        Hunter h1 = new Man();
        h1.hunt();
        h1.show1();
        System.out.println("==");
        h1.show2();

        System.out.println("---------------------------------");
//        2、调用静态方法
        Hunter.test();


    }
}
