package 可变长字符类和时间日期相关类.Date类;

import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
//        1、使用无参构造方法打印
        Date d1 = new Date();
        System.out.println("d1=" + d1);

        System.out.println("-------------------------------------------");
//        2、使用指定的毫秒数构造对象
        Date d2 = new Date(1000);
        System.out.println("d2="+d2);

        System.out.println("-------------------------------------------");
//        3、获取调用对象距离1970年1月1日0时0秒的毫秒数
        Long msec = d2.getTime();
        System.out.println("获取到的毫秒数是"+msec);

        System.out.println("-------------------------------------------");
//        4、设置调用对象所表示的时间点为参数指定的毫秒数
        d2.setTime(2000);
        System.out.println("修改后的时间是"+d2);

    }
}
