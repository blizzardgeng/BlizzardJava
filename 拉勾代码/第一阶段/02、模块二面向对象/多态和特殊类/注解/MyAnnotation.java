package 多态和特殊类.注解;


import java.lang.annotation.*;

/**
 * @author blizzard
 */ //如果一个注解中，没有任何成员，叫做标记注解

//@Retention(RetentionPolicy.SOURCE)  //表示在源代码中有效
//@Retention(RetentionPolicy.CLASS)  //表示在字节码文件中有效。默认方式
//@Retention(RetentionPolicy.RUNTIME)  //表示在运行时有效
//@Deprecated //表示下面的注解信息可以被 avadoc工具提取到AP工文档中,很少使用
//表示下面的注解可以用于类型、构造方法、成员变量、成员方法、参数的修饰
//@Target({ElementType.TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Inherited  //表示下面的注解所修饰的类中的注解使用可以被子类继承
public @interface MyAnnotation {
    public String value() default "123"; //声明一个 String类型的成员变量,名字为value

    public String value2();

}
