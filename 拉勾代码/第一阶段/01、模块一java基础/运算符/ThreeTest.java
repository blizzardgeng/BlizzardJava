package 运算符;

import java.util.Scanner;

/**
 * @author blizzard
 */
public class ThreeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ia = sc.nextInt();
        int ib = sc.nextInt();
        //三元运算的值可以是变量或运算方法
        int max = ia > ib ? ia+1 : ib+1;
        System.out.println(max);
    }
}
