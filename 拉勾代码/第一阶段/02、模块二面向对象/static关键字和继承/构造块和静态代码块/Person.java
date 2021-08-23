package static关键字和继承.构造块和静态代码块;

/**
 * @author : Kevin Geng
 * @ClassName ：Person
 * @date : 2021/6/1 11:36 下午
 */
public class Person {
    //    1、私有化成员变量
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    //    3、在构造方法中调用set方法进行合理值的判断
    public Person() {

        System.out.println("Person()");
    }

    public Person(String name, int age) {

        System.out.println("Person(String,int)");
        setAge(age);
        setName(name);
    }

    //    2、提供公有的qet和set方法并在方法体中进行合理值的判断
    public void setAge(int age) {
        if (0 < age && age < 150) {
            this.age = age;
        } else {
            System.out.println("输入的年龄不合理 ");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("我是" + getName() + ",今年" + getAge() + "岁。");
    }

    //    自定义成员方法描述吃饭行为
    public void ect(String food) {
        System.out.println("吃的是" + food + ",真好吃");
    }

    //    自定义成员方法描述娱乐行为
    public void play(String game) {
        System.out.println("玩的是" + game + ",真好玩");
    }


}

