package 可变长字符类和时间日期相关类.StringBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
//        1、使用无参方式构建对象
        StringBuilder str1 = new StringBuilder();
        System.out.println("str1 = " + str1);
        System.out.println("初始化最大容量是" + str1.capacity());
        System.out.println("初始化数据长度是" + str1.length());
        System.out.println("--------------------------------------------");
//        2、使用参数指定的容量来构造对象并打印
        StringBuilder str2 = new StringBuilder(20);
        System.out.println("str2 = " + str2);
        System.out.println("初始化最大容量是" + str2.capacity());
        System.out.println("初始化数据长度是" + str2.length());

//        3、根据参数自定的字符串内容来构建对象并打印,总长度是字符串长度+16
        StringBuilder str3 = new StringBuilder("hello");
        System.out.println("str3 = " + str3);
        System.out.println("初始化最大容量是" + str3.capacity());
        System.out.println("初始化数据长度是" + str3.length());

        System.out.println("--------------------------------------------");

//        4、实现向字符串中插入和追加
        //在下标0的位插入，也就是开头
        StringBuilder str4 = str3.insert(0, "abcd");  //返回调用对象自己的引用，也就是返回值和调用对象是同一个
        System.out.println("str3=" + str3);           //abcdhello
        System.out.println("str4 = " + str4);         //abcdhello
        //在中间位置插入
        str4.insert(4, "1234");
        System.out.println("str4 = " + str4);         //abcd1234hello
        //像末尾位置插入
        str4.insert(str4.length(), "ACBD");
        System.out.println("str4=" + str4);           //abcd1234helloACBD
        //末尾位置追加字符串
        str4.append("World");
        System.out.println("str4 = " + str4);         //abcd1234helloACBDWorld
        //当字符串的长度超过字符串对象的初始容量时，改字符串会自动扩容，默认扩容算法是：原始容量*2+2
        System.out.println("容量是" + str4.capacity());
        System.out.println("长度是" + str4.length());

        System.out.println("-------------------------------------------------------------");
//        5、实现字符串中字符和字符串的删除
        //删除下标是8的单个字符
        str4.deleteCharAt(8);
        System.out.println("str4 = " + str4);         //abcd1234elloACBDWorld
        //删除字符串
        str4.delete(0, 4);
        System.out.println("str4 = " + str4);         //1234elloACBDWorld
        //删除中间字符串
        str4.delete(4, 12);
        System.out.println("str4 = " + str4);         //1234World
        //删除末尾
        str4.delete(4, str4.length());
        System.out.println("str4 = " + str4);         //1234

        System.out.println("容量是" + str4.capacity());
        System.out.println("长度是" + str4.length());
        System.out.println("-------------------------------------------------------------");
//        6、实现字符串内容的修改查找以及反转功能
        str4.setCharAt(0, 'a');
        System.out.println("修改单个字符内容后是" + str4);           //a234
//        修改"234"为bcd
        str4.replace(1, str4.length(), "bcd");
        System.out.println("修改字符串后是" + str4);         //abcd
        //实现查找功能
        int pos = str4.indexOf("b");
        System.out.println("从前向后查找b的下标是" + pos);            //1

        pos =  str4.lastIndexOf("b");
        System.out.println("从后往前查找b的下标是" + pos);            //1

        //字符串翻转功能
        str4.reverse();
        System.out.println("反转功能打印"+str4);          //dcba

    }
}
