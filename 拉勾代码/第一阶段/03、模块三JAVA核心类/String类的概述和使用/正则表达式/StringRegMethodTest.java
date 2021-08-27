package String类的概述和使用.正则表达式;

public class StringRegMethodTest {
    public static void main(String[] args) {
        String str1 = "1001,zhangfei,30";
        System.out.println("str1 = " + str1);
//        对字符进行切割
        String[] sStr = str1.split(",");
        for (int i = 0; i < sStr.length; i++) {
            System.out.println("下标是" + i + "的字符串是" + sStr[i]);

        }
        System.out.println("---------------------------------");

        String str2 = "我的小名叫张飞";
        String str3 = str2.replace("我", "你");
        System.out.println("str3 = "+str3);

        System.out.println("---------------------------------");
        String str4 = "123abc456def789ghi";

        //将第一个数字字符串替换成#
        String str5 = str4.replaceFirst("\\d+","#");
        System.out.println(str5);
//        将所有字母字符串替换成ABC
        String str6 = str4.replaceAll("[a-z]+", "ABC");
        System.out.println(str6);
    }
}
