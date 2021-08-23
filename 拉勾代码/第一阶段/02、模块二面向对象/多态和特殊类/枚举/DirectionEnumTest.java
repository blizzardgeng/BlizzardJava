package 多态和特殊类.枚举;

/**
 * enum枚举
 * @author blizzard
 */
public class DirectionEnumTest {
    public static void main(String[] args) {
//        1.获 Directionenum类型中所有的枚举对
        DirectionEnum[] directionList = DirectionEnum.values();


        for (DirectionEnum directionEnum : directionList) {
//            2、使用toString方法获取enum对象的名称;
            System.out.println("名称是" + directionEnum.toString());
//            使用ordinal方法获取每个对象的下标
            System.out.println("位置是"+directionEnum.ordinal());

        }

        System.out.println("---------");
//        3、根据参数指定的字符串得到枚举的对象，也就是将字符串转换成对象
        DirectionEnum r =  DirectionEnum.valueOf("DOWN");
        System.out.println(r.toString());

//        4、拿着获取到的枚举对象与枚举类中已经存在的对象比较先后顺序;
        System.out.println("--------------");
//        当调用对录在参数对之后时,获取到的比较结果为正数
//        当调用对象在参数对相同位置时,则获取到的比较结果为零
//        当调用对象在参数对之前时,则获取到的比较结果为负数

        for (int i = 0; i < directionList.length; i++) {

            System.out.println(r.compareTo(directionList[i]));;

        }
        System.out.println("--------------");
        //使用数组中每个对象使用show方法测试

        for (int i = 0; i < directionList.length; i++) {
            directionList[i].show();

        }
    }



}
