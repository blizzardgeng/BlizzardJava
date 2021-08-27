package 可变长字符类和时间日期相关类.Java8中日期相关类.Instant类;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantTest {
    public static void main(String[] args) {
//        1、使用Instant类获取当前时间
        //并不是当前默认时区，本初子午线， 差了8小时，少
        Instant now = Instant.now();
        System.out.println("获取到的时间是"+now);

//        2、加上时区差的8个小时
        OffsetDateTime offsetDateTime = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println("偏移后的时间"+offsetDateTime);

        System.out.println("--------------------------------------------------");
//        3、获取当前调用对象距离标准基准时间的毫秒数

        long l = now.toEpochMilli();
        System.out.println("获取到的毫秒差是"+l);

//        4、根据指定毫秒差来构建对象
        Instant instant = Instant.ofEpochMilli(l);
        System.out.println("根据参数指定的毫秒构造出来的对象是"+instant);

    }
}
