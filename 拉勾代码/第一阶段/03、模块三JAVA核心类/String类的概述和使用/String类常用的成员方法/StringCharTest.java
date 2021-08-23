package String类的概述和使用.String类常用的成员方法;

public class StringCharTest {
    public static void main(String[] args) {

//        1.构造 String类型的对象并打印
        String str1 = new String("hello");

        System.out.println("str1是" + str1);
//        2.获取字符的长度和每个字符并打印
        System.out.println("字符串长度是" + str1.length());

//        System.out.println("下标0的字符是" + str1.charAt(0));
//        System.out.println("下标1的字符是" + str1.charAt(1));
//        System.out.println("下标2的字符是" + str1.charAt(2));
//        System.out.println("下标3的字符是" + str1.charAt(3));
//        System.out.println("下标4的字符是" + str1.charAt(4));

        System.out.println("------------------------------------");
        for (int i = 0; i < str1.length(); i++) {

            System.out.println("下标" + i + "的字符是" + str1.charAt(i));
        }
        System.out.println("------------------------------------");
//        4、判断是否为空;
        System.out.println(0 == str1.length() ? "字符串为空" : "字符串不为空");   //不为空
        System.out.println(str1.isEmpty() ? "字符串为空" : "字符串不为空");        //不为空
        System.out.println("------------------------------------");

//        5、笔试考点
//        使用两种方式实现字符串"12345"，转换成整数方式并打印
        String str2 = "12345";

//        方式一：
        //调用Integer类中的parseInt方法
        Integer in1 = Integer.parseInt(str2);
        System.out.println("方式一"+in1);

//        方式二：
        //利用ASCII方式实现类型转换
        System.out.println("方式二");
        int ib = 0;
        for (int i = 0; i < str2.length(); i++) {
            ib = ib * 10 + (str2.charAt(i) - '0');
            System.out.println(ib);
//            System.out.println(str2.charAt(i) - '0');

        }
        System.out.println(ib);

    }
}
