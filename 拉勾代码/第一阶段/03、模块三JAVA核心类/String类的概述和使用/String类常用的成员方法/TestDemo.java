package String类的概述和使用.String类常用的成员方法;

public class TestDemo {
    public static void main(String[] args) {
//        构造方法
        String str1 = new String("hello");
        System.out.println("构造方法结果是" + str1);
        System.out.println("--------------------------------------------");
        char[] cStr1 = {'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(cStr1);
        System.out.println("char构造对象是"+str2);
        String str3 = new String(cStr1, 1, 3);
        System.out.println("char局部是" + str3);
        System.out.println("--------------------------------------------");
        byte[] bStr1 = {97, 98, 99, 100};
        String str4 = new String(bStr1);
        System.out.println("byte构造对象是" + str4);
        String str5 = new String(cStr1, 2, 2);
        System.out.println("byte局部是" + str5);

        System.out.println("--------------------------------------------");

        String str = "hello";

        byte[] carr = str.getBytes();
        System.out.println("byte输出");
        for (int i = 0; i < carr.length; i++) {
            System.out.println("位置是" + i + ",内容是" + carr[i]);
        }
        System.out.println("--------------------------------------------");
        System.out.println("char输出");
        char[] cArr = str.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            System.out.println("位置是" + i + ",内容是" + cArr[i]);

        }
        System.out.println("--------------------------------------------");
        System.out.println("指定位置输出是" + str.charAt(0));

        System.out.println("判断字符是否是空"+str.isEmpty());


    }
}
