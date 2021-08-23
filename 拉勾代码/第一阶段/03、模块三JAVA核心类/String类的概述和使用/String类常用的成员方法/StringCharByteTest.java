package String类的概述和使用.String类常用的成员方法;

import java.nio.charset.StandardCharsets;

public class StringCharByteTest {

    public static void main(String[] args) {
//        1、创建string类型对象并且打印;
        String str1 = "word";
        System.out.println(str1);
        System.out.println("-------------------------");
//        2、转换成byte数组并打印;
//        思路：先将字符中拆分为字符,将再每个字符转换为byte类型,也就是获取所有字符的 ASCII
        byte[] bStr1 = str1.getBytes();
        for (int i = 0; i < bStr1.length; i++) {
            System.out.println("byte数组位置" + i + ",内容是" + bStr1[i]);
        }

        //将byte数组转换成String类型并打印
        String str2 = new String(bStr1);
        System.out.println("byte转换后的内容是" + str2);
        System.out.println("-------------------------");

//        3、将 String类型转换成char类型并打印
//        思路：将字符拆分为字符并保存到数组引
        char[] cStr1 = str1.toCharArray();
        for (int i = 0; i < cStr1.length; i++) {
            System.out.println("char数组位置" + i + ",内容是" + cStr1[i]);
        }
        //将char数组转换成String并打印
        String str3 = new String(cStr1);
        System.out.println("char转换后的内容是" + str3);

    }
}
