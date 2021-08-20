package 方法和封装.递归;

/**
 * @author : Kevin Geng
 * @date : 2021/5/31 10:31 下午
 */
public class FeeTest {
    public static void main(String[] args) {

        Fee fee = new Fee();
        int num = fee.show(15);
        System.out.println("计算的结果是"+num);
    }
}