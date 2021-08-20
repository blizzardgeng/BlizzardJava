package 多态和特殊类.枚举;

/**
 * @ClassName DirectionTest
 * @Description 方向类测试
 * @Author Kevin
 * @Date 2021/6/18 10:23 下午
 */
public class DirectionTest {
    public static void main(String[] args) {
//        1、声明direction类型引用，指向改类型的对象
//        Direction d1 = new Direction("向上");
//        System.out.println("获取到的字符串是"+d1.getDsc());
//        System.out.println("----------");
//        Direction d2 = new Direction("向下");
//        System.out.println("获取到的字符串是"+d2.getDsc());
//        System.out.println("----------");
//        Direction d3 = new Direction("向左");
//        System.out.println("获取到的字符串是"+d3.getDsc());
//        System.out.println("----------");
//        Direction d4 = new Direction("向右");
//        System.out.println("获取到的字符串是"+d4.getDsc());
//
//        System.out.println("=================");
//        Direction d5 = new Direction("向前");
//        System.out.println("获取到的字符串是"+d5.getDsc());

        Direction d1 = Direction.UP;
        System.out.println(d1.getDsc());
    }

}
