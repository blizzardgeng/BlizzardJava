package 反射机制.Constructor类;

import java.lang.reflect.Constructor;

public class PersonConstructorTest {

    public static void main(String[] args) throws Exception {
//        1、使用原始形式以无参的方式构造对象并打印

        Person p1 = new Person();
        System.out.println("无参方式构建的对象：" + p1);
        System.out.println("---------------------------------------");
//        2、使用反射机制以无参的方式构造对象并打印


        Class c1 =  Class.forName("反射机制.Constructor类.Person");

        //System.out.println("使用反射机制无参构建的对象是:" + c1.newInstance());
        Constructor constructor = c1.getConstructor();      //获取class对象对应类中的无参构造方法，在这里也就是Person的无参构造方法
        //使用获取到的无参构造方法来构造对应的类型的对象
        System.out.println("使用无参方式构建的对象是" + constructor.newInstance());

        System.out.println("---------------------------------------");
//        3、使用原始有参方式构建对象
        Person p2 = new Person("张飞", 30);
        System.out.println("使用原始有参的方式构建对象" + p2);

        System.out.println("---------------------------------------");
//        4、使用反射机制以有参的方式构建对象
        //获取class对象对应类中的有参构造方法，也就是Person类中的有参构造方法
        Constructor constructor1 = c1.getConstructor(String.class, int.class);
        //使用获取到的有参构造方法来获取对应的类型对象，也就是Person类型的对象
//        newInstance方法中的实参是用于给有参方法的实参进行初始化的，也就是给name和age参数进行初始化
        System.out.println("有参方式构建的对象是"+constructor1.newInstance("张飞",30));

        System.out.println("---------------------------------------");
//        5、使用反射机制获取Person类中的所有公共构造方法并打印
        Constructor[] constructors = c1.getConstructors();
        for (Constructor c : constructors
        ) {
            System.out.println("构造方法中的修饰符是"+c.getModifiers());
            System.out.println("构造方法的方法名是" + c.getName());
            Class[] parameterTypes = c.getParameterTypes();
            System.out.println("构造方法的所有参数类型是");
            for (Class cs : parameterTypes
            ) {
                System.out.println(cs + " ");
            }
            System.out.println("======");
        }

//反射机制.常用方法.Person
    }

}
