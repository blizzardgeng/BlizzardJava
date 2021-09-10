package 反射机制.Class对象的获取方式;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {

//        1、是用数据类型.class方法获取对应的class对象
        Class c1 = String.class;
        System.out.println("c1 = "+c1);     //自动调用toString方法        c1 = class java.lang.String

        c1 = int.class;
        System.out.println("c1 = "+c1);             //c1 = int

        c1 = void.class;
        System.out.println("c1 = "+c1);             //c1 = void
        System.out.println("------------------------------------------");
//        2、使用对象.getClass()的方式获取对应的class对象
        String str = new String();
        c1 = str.getClass();
        System.out.println("c1 = "+c1);             //c1 = class java.lang.String

        Integer it = 20;
        c1 = it.getClass();
        System.out.println("c1 = "+c1);             //c1 = class java.lang.Integer

        //int num = 5;
        //num.geClass//    报错。基本数据类型的变量不能调用方法

        System.out.println("------------------------------------------");
//        3、使用包装类.TYPE获取对应的基本类型对象
        c1 = Integer.TYPE;
        System.out.println("c1 = "+c1);             //c1 = int

        c1 = it.getClass();
        System.out.println("c1 = "+c1);             //c1 = class java.lang.Integer
        System.out.println("------------------------------------------");

//        4、调用CLass类中的forName方法来调用CLass对象
//        c1 = Class.forName("String");         error
        c1 = Class.forName("java.lang.String");         //必须写完整路径报名.类名   c1 = class java.lang.String
        System.out.println("c1 = "+c1);

        c1 = Class.forName("java.util.Date");               //c1 = class java.util.Date
        System.out.println("c1 = "+c1);

//        Class.forName("int");             //不能获取基本数据类型的Class类型对象

        System.out.println("------------------------------------------");
//        5、使用类加载器的方式来获取Class对象
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        c1 = classLoader.loadClass("java.lang.String");
        System.out.println("c1 = "+c1);             //class java.lang.String


    }

}
