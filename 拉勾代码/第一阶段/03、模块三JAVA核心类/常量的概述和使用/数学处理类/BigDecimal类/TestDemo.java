package 常量的概述和使用.数学处理类.BigDecimal类;

import java.math.BigDecimal;

public class TestDemo {
    public static void main(String[] args) {

        BigDecimal a1 = new BigDecimal("10");
        BigDecimal a2 = new BigDecimal("5");

        System.out.println("+++" + a1.add(a2));
        System.out.println("---" + a1.subtract(a2));
        System.out.println("***" + a1.multiply(a2));
        System.out.println("///" + a1.divide(a2));
    }
}
