package 类和对象;

import java.util.Arrays;

/**
 * @author blizzard
 */
public class Person {

    //数据类型 成员变量名 = 初始值 --其中 = 初始值 通常省略不写

    String name;
    int age;


    void showArgument(String... testData) {
        for (int i = 0; i < testData.length; i++) {
            System.out.println("第" + i + "个参数是" + testData[i]);
        }
    }

    void show() {
        System.out.println("姓名是" + name + ",年龄是" + age);
    }

    //自定义成员方法实现将姓名修改为参数指定数值的行为
    void modifyName(String newName) {
        name = newName;
    }
//    自定义成员方法实现将年龄修改为参数指定数值的行为
    void modifyAge(int newAge) {

        age = newAge;
    }

    void modifyData(String newName,int newAge) {
        name = newName;
        age = newAge;
    }



    public static void main(String[] args) {
        //1.声明 Person类型的引用指向 Person类型的对象
        //数据类型 引用变量名 = new 类名();
        Person p = new Person();
//        2.打印对象中的成员变量值
//        引用变量名.成员变量名（实参列表）
        p.show();
        p.name = "张三";
        p.age = 18;
        p.show();
        p.modifyAge(20);
        p.modifyName("哈哈");
        p.show();
        p.modifyData("刘德华", 99);
        p.show();
        System.out.println("---------------------");
        p.showArgument();
        System.out.println("---");
        p.showArgument("参数1");
        System.out.println("---");
        p.showArgument("参数2","参数2");

    }

}
