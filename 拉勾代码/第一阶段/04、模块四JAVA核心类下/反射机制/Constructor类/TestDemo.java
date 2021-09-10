package 反射机制.Constructor类;

import java.lang.reflect.Constructor;

public class TestDemo {

    public static void main(String[] args) throws Exception {

//        1、使用无参的方式构建对象

        Class aClass = Class.forName("反射机制.Constructor类.Person");
        Constructor constructor = aClass.getConstructor();
        System.out.println("无参构造的对象是" + constructor.newInstance());
        System.out.println("------------------------------");

//        2、使用有参构造方式构建对象
        Constructor constructor1 = aClass.getConstructor(String.class, int.class);
        System.out.println("使用有参方式构建的对象是"+constructor1.newInstance("张飞",30));

//        3、获取所有构造方法并打印

        Constructor[] constructors = aClass.getConstructors();

        for (Constructor c : constructors
        ) {
            System.out.println("构造方法的名称是"+c.getName());
            System.out.println("构造方法的修饰符是" + c.getModifiers());
            System.out.println("构造方法的参数数量是");

            for (Class parameterType : c.getParameterTypes()) {
                System.out.println(parameterType);

            }


        }


    }
}
