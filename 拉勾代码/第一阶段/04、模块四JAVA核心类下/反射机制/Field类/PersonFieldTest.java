package 反射机制.Field类;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class PersonFieldTest {
    public static void main(String[] args) throws Exception{
//        1、使用原始方式获取构造对象以及获取成员数值并进行打印

        Person p1 = new Person("张飞", 30);

//        System.out.println("原值值是"+p1.name);
        System.out.println("-------------------------------------------------------------");

//        2、使用反射机制构造对象以及获取成员变量并打印
//        2.1获取CLass对象
        Class aClass = Class.forName("反射机制.Field类.Person");
//        2.2根据cLass对象获取对应的有参构造方法
        Constructor constructor = aClass.getConstructor(String.class, int.class);
//        2.3使用有参构造方法来得到Person类型到的对象
        Object p2 = constructor.newInstance("关羽", 30);
//        2.4根cLass对象获取对应的成员变量信息
        Field field = aClass.getDeclaredField("name");
        //设置java语言访问检查      暴力反射
        field.setAccessible(true);

//        2.5使用Person类型的对象来获取成员变量的数值并打印
        //获取对象Object中名字为field成员变量的数值，也就是Person中的name
        System.out.println("获取到的成员变量值是" + field.get(p2));

        System.out.println("-------------------------------------------------------------");
//        3、修改制定成员变量的数值并打印
//        使用原始方式
//        p1.name = "关羽";
//        System.out.println("修改后的数值是"+p1.name);
//       4、使用反射机制修改指定成员变量中的数值
        //表示修改Object中成员变量的值为刘备，也就是p2的值修改为刘备
        field.set(p2, "刘备");
        System.out.println("获取到的成员变量值是" + field.get(p2));

        System.out.println("-------------------------------------------------------------");
//        5、获取class类中的所有成员变量
        for (Field aClassField : aClass.getDeclaredFields()) {
            System.out.println("获取到的访问修饰符是" + aClassField.getModifiers());
            System.out.println("获取到的数据类型是" + aClassField.getType());
            System.out.println("获取到的成员变量名称是" + aClassField.getName());
            System.out.println("====");

        }


    }
}
