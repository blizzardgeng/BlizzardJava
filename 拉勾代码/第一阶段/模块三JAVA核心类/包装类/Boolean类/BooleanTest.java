package 包装类.Boolean类;

import com.sun.org.apache.xml.internal.serializer.utils.BoolStack;

public class BooleanTest {
    public static void main(String[] args) {
//        1、在java5以前，采用方法进行封装和拆箱
//        封箱
        Boolean bo1 = Boolean.valueOf(true);
        System.out.println("bi = " + bo1);
//        拆箱
        boolean b1 = bo1.booleanValue();
        System.out.println("b2 = " + b1);

//        2、从java5以后实现自动装箱和自动封箱
        Boolean bo2 = false;
        boolean d2 = bo2;
        System.out.println("b2 = " + d2);
        System.out.println("------------------------");

//        3、从String类型到Boolean类型转换;
        boolean b3 = Boolean.parseBoolean("false");  //只有true是true,不区分大小写
        System.out.println("b3 = "+b3);

    }
}
