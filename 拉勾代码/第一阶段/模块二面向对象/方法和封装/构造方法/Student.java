package 第一阶段.模块二面向对象.方法和封装.构造方法;

/**
 * @author : Kevin Geng
 * @date : 2021/5/31 10:34 下午
 */
public class Student {

//    1私有化成员变量 ,private

    private int age;
    private String name;

    //
//     2.提供公有的get和set方法,并在方法体中进行合理值的判断，公有化成员变量 ， public
    public int getAge() {

        return age;
    }

    public String getName() {
        return name;
    }

    public Student() {

    }

    //    3.在共有的set方法中调用set方法
    public Student(int age, String name) {
        setAge(age);
        setName(name);
    }


    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("年龄不合理");
        }


    }

    public void setName(String name) {
        this.name = name;
    }


    void show() {
        System.out.println("我的姓名是" + getName() + "我的年龄是" + getAge());

    }
}
