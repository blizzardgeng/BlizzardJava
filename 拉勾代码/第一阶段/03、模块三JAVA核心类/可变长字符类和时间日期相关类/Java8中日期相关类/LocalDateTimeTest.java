package 可变长字符类和时间日期相关类.Java8中日期相关类;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

    public static void main(String[] args) {
//        1、获取当前日期并打印
        LocalDate now = LocalDate.now();
        System.out.println("获取到的日期是"+now);

//        2、获取当前时间并打印
        LocalTime now1 = LocalTime.now();
        System.out.println("获取到的时间是"+now1);
//        3、  获取当前日期时间并打印   使用最多
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("获取到的日期时间是"+now2);

        System.out.println("--------------------------------------------------");
//        4、使用参数指定的年月日时分秒信息构造对象并打印
        LocalDateTime of = LocalDateTime.of(2008, 8, 8, 8, 20, 8, 8);
        System.out.println("指定的日期时间是"+of);   //自动调用toString
        //获取
        System.out.println("获取到的年是" + of.getYear());
        System.out.println("获取到的月是" + of.getMonthValue());
        System.out.println("获取到的日是" + of.getDayOfMonth());
        System.out.println("获取到的时是" + of.getHour());
        System.out.println("获取到的分是" + of.getMinute());
        System.out.println("获取到的秒是" + of.getSecond());


        System.out.println("--------------------------------------------------");
//        5、实现特征设置并打印。调用数据本身的内容不会改变，返回值是创建了一个新的对象
        LocalDateTime localDateTime = of.withYear(2012);            //2012-08-08T08:20:08.000000008
        System.out.println("返回值"+localDateTime);
        System.out.println("调用"+of);
        LocalDateTime localDateTime1 = localDateTime.withMonth(9);
        System.out.println("设置月份之后" + localDateTime1);


        System.out.println("--------------------------------------------------");
//        6、实现增加并打印
        LocalDateTime localDateTime2 = localDateTime1.plusDays(2);
        System.out.println("增加2天时间打印"+localDateTime2);

        LocalDateTime localDateTime3 = localDateTime2.plusHours(3);
        System.out.println("增加3个小时"+localDateTime3);


        System.out.println("--------------------------------------------------");
//        7、减少
        LocalDateTime localDateTime4 = localDateTime3.minusDays(2);
        System.out.println("减少2天时间"+localDateTime4);


    }


}
