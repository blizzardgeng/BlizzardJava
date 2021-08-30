package String类的概述和使用.String类常用的成员方法.查找方法;


import org.w3c.dom.ls.LSOutput;

public class StringFindTest {
    public static void main(String[] args) {
//        1、构造String类型对象并打印;
        String str1 = new String("Good Good Study，Day Day Up!");
        System.out.println("str1 = " + str1);
//        2、实现查找功能
        //返回指定字符第一次出现的索引位置,如果结果没有，返回-1,代表没有找到
        int in1 = str1.indexOf('g');
        System.out.println("查找g结果是 = "+in1);

        int in2 = str1.indexOf('G');
        System.out.println("查找G结果是 = "+in2);
        System.out.println("-------------------------------------------------------");
        //从下标0开始查找字符G所出现的位置,包含指定起始位置
        int in3 = str1.indexOf('G',1);
        System.out.println("查找G结果是 = "+in3);
        System.out.println("-------------------------------------------------------");
//        3、查找字符串
        int in4 = str1.indexOf("day");
        System.out.println("查找day结果是 = " + in4);
        //获取到字符的第一个下标
        int in5 = str1.indexOf("Day");
        System.out.println("查找Day结果是 = " + in5);

        int in6 = str1.indexOf("Day",16);
        System.out.println("查找Day结果是 = " + in6);


        int pos = str1.indexOf("Day");
        System.out.println("-------------------------------------------------------");
        while (-1 != pos) {
            System.out.println("pos = "+pos);
            pos = str1.indexOf("Day", pos + 1);
        }
        System.out.println("-------------------------------------------------------");
        //优化.java8不支持
//        while ((pos = str1.indexOf("Day", pos)) != 1) {
//            System.out.println("pos = " + pos);
//            pos += "Day".length();
//        }
        System.out.println("===================================================================================");
        //实现字符和字符串的反向查找
        int inf1 = str1.lastIndexOf('G');
        System.out.println("反向查找G的结果是= "+inf1);

        int inf2 = str1.lastIndexOf('G',5);
        System.out.println("通过下标4反向查找G的结果是= "+inf2);
        System.out.println("通过下标4反向查找G的结果是= "+inf2);

    }
}
