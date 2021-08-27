package 可变长字符类和时间日期相关类.Calendar类;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
//        1、获取calendar类型对象
        Calendar cal = Calendar.getInstance();
//        2、设置时间信息,月份需要-1
        cal.set(2008,8-1,8,20,8,8);
//        3、转换成Date类型
        Date d1 = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format = sdf.format(d1);
        System.out.println("获取到的时间是"+format);           //2008-08-08 20:08:08


        System.out.println("-------------------------------------------------------------");
        //修改时间内容
        cal.set(Calendar.YEAR, 2018);
        //转换格式
        Date d2 = cal.getTime();
        String format1 = sdf.format(d2);
        System.out.println("修改年份后时间"+format1);          //2018-08-08 20:08:08


        cal.add(Calendar.MONTH, 2);
        //转换格式
        Date d3 = cal.getTime();
        String format2 = sdf.format(d3);
        System.out.println("修改月份后时间"+format2);          //2018-10-08 20:08:08




    }
}
