package 可变长字符类和时间日期相关类.Java8中日期相关类.DateTimeFormatter类;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
//        1、获取当前系统日期并打印
        LocalDateTime d1 = LocalDateTime.now();
        System.out.println("d1 ="+d1);
//        2、准备一个DateTimeFormatter类型的对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy,MM,dd HH:mm:ss");
//        3、实现日期时间转字符串类型的转换并打印
        String str = dateTimeFormatter.format(d1);
        System.out.println("调整格式后"+str);

//        4、实现字符串类型转日期时间的转换并打印

        TemporalAccessor parse = dateTimeFormatter.parse(str);
        System.out.println("转回去"+parse);

    }
}
