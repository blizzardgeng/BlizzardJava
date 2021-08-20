package 第一阶段.模块二面向对象.多态和特殊类.注解;

import java.lang.annotation.Repeatable;

@Repeatable(value = ManTypes.class)
public @interface ManType {

    String value() default "";

}
