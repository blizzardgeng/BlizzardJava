package String类的概述和使用.String类常用的成员方法;

public class StringMethodTest {

    public static void main(String[] args) {
        String str1 = new String("     Let me Give You Some Color to See See!");
        System.out.println("str1 = " + str1);


        //判断是否包含，区分大小写
        boolean b1 = str1.contains("some");
        System.out.println("判断是否包含some = "+b1);     //false
        boolean b2 = str1.contains("Some");
        System.out.println("判断是否包含some = "+b2);   //true

        System.out.println("-----------------------------------------");
        //转换成大写,整个字母都会转换
        String str2 = str1.toUpperCase();
        System.out.println("转换成大写 = "+str2);
        System.out.println("-----------------------------------------");
        //转换成小写,整个字母都会被转换

        String str3 = str1.toLowerCase();
        System.out.println("转换成小写 = " + str3);
        System.out.println("-----------------------------------------");

        //去除空白
        String str4 = str1.trim();
        System.out.println("去除两边空白 = " + str4);

        System.out.println("-----------------------------------------");

        //字符串是否以什么什么开头
        boolean b3 = str1.startsWith("acb");
        System.out.println("判断是否以abc开头 = " + b3);
        boolean b4 = str1.startsWith(" ");
        System.out.println("判断是否以 开头 = " + b4);   //false
        boolean b5 = str1.startsWith("Le",5);   //true
        System.out.println("判断从下标5开始，是否以 开头 = " + b5);   //true

        System.out.println("-----------------------------------------");
        boolean b6 = str1.endsWith("See");
        System.out.println("判断是否以See结尾 = " + b6);       //false






    }
}
