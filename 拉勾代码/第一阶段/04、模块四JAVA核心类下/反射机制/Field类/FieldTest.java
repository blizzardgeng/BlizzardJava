package 反射机制.Field类;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class FieldTest {

    public static void main(String[] args) throws Exception {


//        1、获取class类对象
        Class aClass = Class.forName("反射机制.Field类.Person");
//        2、通过class获取指定类的构造器
        Constructor constructor = aClass.getConstructor(String.class, int.class);

//        3、通过构造器创建对象
        Object obj = constructor.newInstance("海利轩", 30);
//        4、获取对象的参数数值

        Field field = aClass.getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(obj));
//        5、修改参数数值
        field.set(obj, "刘德华");
        System.out.println(field.get(obj));

//        6、获取类中的成员变量方法
        for (Field declaredField : aClass.getDeclaredFields()) {
            System.out.println("访问修饰符是" + declaredField.getModifiers());
            System.out.println("访问方法名称是" + declaredField.getName());
            System.out.println("访问方法类型是" + declaredField.getType());

        }


    }
}
