package 包装类.Integer类;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IntegerTest {


    public static void main(String[] args) {
        //    1、打印Integer中的常量数值
        System.out.println("最大值是" + Integer.MAX_VALUE);
        System.out.println("最小值是" + Integer.MIN_VALUE);
        System.out.println("所表示的二进制位数是" + Integer.SIZE);
        System.out.println("所占的字节个数是" + Integer.BYTES);
        System.out.println("对int类型的class实例是" + Integer.TYPE);

        System.out.println("-------------------------------------");
//        2、使用构造方法构造Integer对象来打印

        Integer it1 = new Integer(123);  //自动调用toString方法，java9以上不能用
        System.out.println("it1=" + it1);

        // 从String 转换到int
        Integer it2 = new Integer("456");  //java9以上不能用
        System.out.println("it2=" + it2);
//        上方法过时，建议使用valueOf方法,
        //从int类型到Integer类型转换,名称叫做装箱
        Integer it3 = Integer.valueOf(123);
        System.out.println("it3=" + it3);
        //从String类型到Integer类型转换,名称叫做装箱
        Integer it4 = Integer.valueOf("123");
        System.out.println("it3=" + it4);


//      从String类型到int类型转换
        Integer it5 = Integer.parseInt("456"); //自动调用toString方法
        System.out.println("it4=" + it5);

        //获取调用对象中的整数,从Integer类型转换到int类型,名称叫拆箱
        int ia = it5.intValue();
        System.out.println("获取到的整数数据是=" + ia);
        System.out.println("-----------------------");
//       3、 从java5开始，增加了自动装箱，自动拆箱的机制
        Integer it6 = 100; //Integer it6 = Integer.valueOf(100);   自动装箱
        int it7 = it6; //Integer it6 = .intValue(it6);     自动拆箱
        System.out.println("-------------------");
//        4、装箱和拆箱的笔试考点
        Integer it8 = 127; //128
        Integer it9 = 127; //128
        Integer it10 = new Integer(127); //new Integer(128),
        Integer it11 = new Integer(127); //new Integer(128),
        System.out.println(it8 == it9);             //比较地址  -128到127是true，则false
        System.out.println(it8.equals(it9));        //比较内容  true
        System.out.println(it10 == it11);           //比较地址  false
        System. out. println(it10.equals(it11));    //比较内容  true

        System.out.println("-----------------");
//        5、实现静态方法的调用

        //      从String类型到int类型转换
        Integer ic = Integer.parseInt("200"); //自动调用toString方法
        System.out.println("字符串转换成整数" + ic);
        System.out.println("根据指定的参数转换成十进制字符串是"+Integer.toString(200));
        System.out.println("根据指定的参数转换成二进制字符串是"+Integer.toBinaryString(200));
        System.out.println("根据指定的参数转换成十六进制字符串是"+Integer.toHexString(200));
        System.out.println("根据指定的参数转换成八进制字符串是"+Integer.toOctalString(200));

    }

}
