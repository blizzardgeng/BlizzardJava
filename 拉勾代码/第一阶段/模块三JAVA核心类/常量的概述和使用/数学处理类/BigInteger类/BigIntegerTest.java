package 常量的概述和使用.数学处理类.BigInteger类;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {
//        1、构造两个BigInteger对象，并指派初始值
        BigInteger bi1 = new BigInteger("20");
        BigInteger bi2 = new BigInteger("6");
        System.out.println("输出打印");
        System.out.println("实现加法运算结果是" + bi1.add(bi2));
        System.out.println("实现减法运算结果是" + bi1.subtract(bi2));
        System.out.println("实现乘法运算结果是" + bi1.multiply(bi2));
        System.out.println("实现除法运算结果是" + bi1.divide(bi2));
        System.out.println("实现取余运算结果是" + bi1.remainder(bi2));
        System.out.println("------------------");
//        一次性得到商和余数、
        BigInteger[] arr = bi1.divideAndRemainder(bi2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("下表是"+i+",内容是"+arr[i]);

        }
    }
}
