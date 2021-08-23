package String类的概述和使用.String类构造方法使用;

public class StringExamTest {

    public static void main(String[] args) {
//        创建的对象数量
//        String str1 = "abc";   //1个对象，在常量池
//        String str2 = new String("abc");  //2个对象，new在堆区，双引号在常量池

//        2、常量池和堆区地址考点
        String str1 = "abc";       //常量池
        String str2 = "abc";        //常量池
        String str3 = new String("abc");        //堆区
        String str4 = new String("abc");        //堆区

        System.out.println(str1 == str2);            //true
        System.out.println(str1.equals(str2));       //true

        System.out.println(str3 == str4);            //false
        System.out.println(str3.equals(str4));       //true

        System.out.println(str2 == str4);            //false
        System.out.println(str2.equals(str4));       //true

        System.out.println("------------------");

        String str5 = "abcd";
        String str6 = "ab" + "cd";
//        常量优化机制
        System.out.println(str5 == str6);           //true

        System.out.println("------------------");

        String str7 = "abcd";
        String str8 = str7 + "cd";
//        常量优化机制,变量没有
        System.out.println(str7 == str8);           //false
    }
}
