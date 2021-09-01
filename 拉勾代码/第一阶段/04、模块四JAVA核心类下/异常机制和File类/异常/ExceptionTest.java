package 异常机制和File类.异常;

public class ExceptionTest {
    public static void main(String[] args) {
//        1、非检测性异常,运行时异常
        System.out.println(5 /0);

        System.out.println("结束");
//        2、检测性异常,编译时运行
//        Thread.sleep(1000);     //如果不处理无法运行


    }
}
