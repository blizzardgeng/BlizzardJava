package 常量的概述和使用.包装类.Integer类;

public class TestData {

    public static void main(String[] args) {

        int in = 10;
        //装箱
        Integer age = Integer.valueOf(in);
        System.out.println("int转换成Integer类对象" + age);

        //拆箱
        int in2 = age.intValue();
        System.out.println("Integer转换int是"+in2);

        int in1 = Integer.parseInt("123");
        System.out.println("String类型转换int类型" + in1);



        String str1 = age.toString();
        System.out.println("Integer类型转String是" + str1);

    }
}
