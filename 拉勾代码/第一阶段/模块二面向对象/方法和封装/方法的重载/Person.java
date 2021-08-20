package 第一阶段.模块二面向对象.方法和封装.方法的重载;

public class Person {
    String name;
    int age;


    //自定义无参数的构造方法
    Person() {

    }

    //自定义构造方法
    Person(String name, int age) {

//        自定义初始化方法,就近原则，如果形参跟成员属性名称相同，需要加上this关键字
        this.name = name;
        this.age = age;
    }

    void show() {
//        grow();
        System.out.println("我是"+name+"，今年"+age+"岁");
    }

    //方法的重载
    void grow() {
        age++;
    }

    void grow(int a) {
        age += a;

    }

    //自定义成员方法实现Person类型对象的hu获取并返回,返回的当前调用的对象本身
    Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
//        当类中没有构造方法时候，下面自动调用默认的构造方法。当类中有定义方法，代码则不会提供任何形式当构造方法
        Person p1 = new Person("张飞",30);
        p1.show();
        Person p2 = new Person("关羽",36);
        p2.show();
        System.out.println("--------------");
        p1.grow();
        p1.show();
        p1.grow(5);
        p1.show();
        System.out.println("-----------");
        //调用成员方法获取对象
        Person p3 = p1.getPerson();
        System.out.println("p1="+p1);
        System.out.println("p3="+p3);
    }
}
