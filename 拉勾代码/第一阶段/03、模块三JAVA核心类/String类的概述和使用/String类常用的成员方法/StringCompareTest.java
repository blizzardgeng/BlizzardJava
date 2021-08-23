package String类的概述和使用.String类常用的成员方法;

public class StringCompareTest {
    public static void main(String[] args) {

//        1 、构造String类型对象并打印

        String str1 = new String("hello");
        System.out.println("str1 = " + str1);

//        2.使用构造好的对泉与其它字符串对之间比较木小并打印
        System.out.println(str1.compareTo("word"));
        System.out.println(str1.compareTo("haha"));
        System.out.println(str1.compareTo("hehe"));
        System.out.println(str1.compareTo("heihei"));
        System.out.println(str1.compareTo("hello word"));
        System.out.println(str1.compareTo("HELLO"));
    }
}
