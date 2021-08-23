package 常量的概述和使用.包装类.Double类;

public class DoubleTest {
    public static void main(String[] args) {

//        1、在java5之前的封箱和拆箱
        //封箱，实现double类型到Double类型转换
        Double db1 = Double.valueOf(3.14);
        System.out.println("db1 = "+db1);
        //拆箱，实现Double类型到double类型转换
        double d1 = db1.doubleValue();
        System.out.println("d1 = "+d1);

        System.out.println("----------------------");
//        2、java5之后实现自动装箱和自动拆箱
        Double db2 = 3.14;
        double d2 = db2;
        System.out.println("-----------------------");
//        3、实现成员方法和静态方法的调用
        double d3 = Double.parseDouble("3.14");
        System.out.println("d3 = "+d3);

        System.out.println(db2.isNaN());    //false  不是非数字
        Double db3 = Double.valueOf(0 / 0.0);
        System.out.println(db3.isNaN());    //true   非数字

    }
}
