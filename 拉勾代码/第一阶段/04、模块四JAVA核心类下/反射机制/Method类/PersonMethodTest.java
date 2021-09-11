package 反射机制.Method类;

import 反射机制.Constructor类.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PersonMethodTest {

    public static void main(String[] args) throws Exception {
//        1、原始方式构造对象并调用方法打印结果
        Person p1 = new Person("张飞", 30);
        System.out.println("调用方法的返回值是" + p1.getName());

//        2、使用反射机制构造对象并调用方法打印结果
//        1、获取class对象
        Class aClass = Class.forName("反射机制.Method类.Person");
//        2、获取构造方法
        Constructor constructor = aClass.getConstructor(String.class, int.class);
//        3、创建对象
        Object obj = constructor.newInstance("刘备", 60);
//        4、获取对象方法
        Method method = aClass.getMethod("getName");
//        5、调用
        //表示使用obj对象调用method所表示的方法
        System.out.println("反射调用无参方法返回的结果是" + method.invoke(obj));            //反射调用无参方法返回的结果是刘备
        System.out.println("--------------------------------------------");
//        获取有参方法吧并上传参数打印
        Method show = aClass.getMethod("show", String.class);

        System.out.println("反射调用有参方法返回的结果是" + show.invoke(obj, "haha"));            //反射调用有参方法返回的结果是haha

        System.out.println("--------------------------------------------");
//        3、使用反射机制获取类中的所有成员方法并打印
        for (Method aClassMethod : aClass.getMethods()) {
            System.out.println("成员方法获取到的修饰符是" + aClassMethod.getModifiers());
            System.out.println("成员方法获取到的返回值类型是" + aClassMethod.getReturnType());
            System.out.println("成员方法的名称是" + aClassMethod.getName());
            System.out.println("成员方法的形参类型是");
            for (Class<?> parameterType : aClassMethod.getParameterTypes()) {
                System.out.println(parameterType + "");

            }
            System.out.println("===");
            System.out.println("成员方法的异常类型是");
            for (Class<?> exceptionType : aClassMethod.getExceptionTypes()) {
                System.out.println(exceptionType + "");
            }

            System.out.println("===");

        }


    }
}
