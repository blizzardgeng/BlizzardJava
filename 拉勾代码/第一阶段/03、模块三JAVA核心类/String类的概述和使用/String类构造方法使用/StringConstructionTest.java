package String类的概述和使用.String类构造方法使用;

public class StringConstructionTest {
    public static void main(String[] args) {
//        1、使用无参方式打印
        //""，表示空字符串对象，只是对象内没有内容
        //null，表示对象都没有
        String str1 = new String();
        System.out.println("使用无参方式打印是" + str1);   // ""   打印自动调用toString方法

//        2、使用参数指定的bytes数组打印
        byte[] bArr = {97, 98, 99, 100, 101};
//        使用字节数组中的一部分内容来构造对
        String str2 = new String(bArr, 1, 3);
        System.out.println( "指定byte集合对象是" + str2);   //bcd
//        使用整个字节数组来构造字符串对象
        String str3 = new String(bArr);
        System.out.println("所有byte集合对象是" + str3);  //abcde
//        使用字符数组来构建对象
        char[] cArr = {'h', 'e', 'l', 'l', 'o'};

        String str4 = new String(cArr, 1, 3);
        System.out.println( "指定char集合对象是" + str4);   //ell

        String str5 = new String(cArr);
        System.out.println("所有char集合对象是" + str5);

//        根据指定参数构造对象
        String str6 = new String("qwe");
        System.out.println("指定参数构造对象" + str6);

    }


}
