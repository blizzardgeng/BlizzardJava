package 异常机制和File类.异常.Finally;

public class ExceptionFinallyTest {
    public static void main(String[] args) {

        try {


            int ia = 10;
            int ib = 0;

            System.out.println(ia / ib);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }finally {

            System.out.println("无论发生异常都运行");
        }

    }
}
