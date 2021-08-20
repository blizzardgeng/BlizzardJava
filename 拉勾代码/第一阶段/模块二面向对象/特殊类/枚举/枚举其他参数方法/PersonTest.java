package 第一阶段.模块二面向对象.特殊类.枚举.枚举其他参数方法;

import 第一阶段.模块二面向对象.多态和特殊类.枚举.DirectionEnum;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/18 15:27:17
 */
public class PersonTest {

    public static void main(String[] args) {

        Person p1 = Person.DOWN;


//         1、返回当前枚举类中所有对象,并输入对象内容、对象的位置
        Person[] PList = Person.values();

        for (int i = 0; i < PList.length; i++) {
            System.out.println("当前对象是"+PList[i].toString()+"当前位置是"+i);
        }

        System.out.println("-------------------------");
//        2、将字符串转换成对象
        Person r =  Person.valueOf("DOWN");
        System.out.println(r.toString());

    }
}
