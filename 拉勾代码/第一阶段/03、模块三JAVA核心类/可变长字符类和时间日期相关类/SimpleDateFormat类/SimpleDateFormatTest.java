package 可变长字符类和时间日期相关类.SimpleDateFormat类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
//        1、获取当前系统时间
        Date d1 = new Date();
        System.out.println("d1="+d1);
//        2、构造SimpleDateFormat类对象并指定格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


//        3、实现日期类型向文本类型的转换并打印
        String format = sdf.format(d1);
        System.out.println("转换文本类型格式为" + format);
//        4、 实现文本类型转换日期类型并打印\
        Date parse = sdf.parse(format);
        System.out.println("转换日期格式为"+parse);

    }
}
