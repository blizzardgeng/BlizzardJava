package 反射机制.其他结构信息;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public class StudentTest {

    public static void main(String[] args) throws Exception {
//        1、获取Student类型的对象
        Class aClass = Class.forName("反射机制.其他结构信息.Student");
        System.out.println("获取到的包信息是" + aClass.getPackage());

        System.out.println("获取到的父类信息是" + aClass.getSuperclass());

        System.out.println("获取到的接口信息是");
        for (Class anInterface : aClass.getInterfaces()) {
            System.out.println(anInterface);

        }
        System.out.println("获取到的注解信息是");
        for (Annotation annotation : aClass.getAnnotations()) {

            System.out.println(annotation);

        }

        System.out.println("获取到的泛型信息是");
        for (Type genericInterface : aClass.getGenericInterfaces()) {
            System.out.println(genericInterface);
        }


    }
}
