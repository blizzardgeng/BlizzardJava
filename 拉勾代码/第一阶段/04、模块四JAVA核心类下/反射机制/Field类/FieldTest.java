package 反射机制.Field类;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FieldTest {

    public static void main(String[] args) throws Exception {

//        1、获取class对象
        Class aClass = Class.forName("反射机制.Field类.Person");
//        2、通过class对象获取构造方法
        Constructor constructor = aClass.getConstructor(String.class, int.class);
//        3、通过构造方法创建对象
        Object obj = constructor.newInstance("张飞", 30);
//        4、通过Field获取成员变量
        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("获取到的内容是" + field.get(obj));

//        5、修改成员变量的值
        field.set(obj, "哈哈");
        System.out.println("获取到的内容是" + field.get(obj));
    }
}
