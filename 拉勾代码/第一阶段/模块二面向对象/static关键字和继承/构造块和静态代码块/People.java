package 第一阶段.模块二面向对象.static关键字和继承.构造块和静态代码块;

/**
 * @author : Kevin Geng
 * @ClassName ：People
 * @date : 2021/6/1 9:24 下午
 */

public class People {
    private String name;
    private int age;
    private static String countries;


    People() {

    }

    People(String name, int age /*String countries*/) {
        setName(name);
        setAge(age);
//        setCountries(countries);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (0 < age && age < 150) {
            this.age = age;
        }else {
            System.out.println("输入的年龄有误");
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static String getCountries() {
        return countries;
    }
    public static void setCountries(String countries) {
        People.countries = countries;
    }

    void show() {
        System.out.println("姓名是"+getName()+",年龄是"+getAge()+",国家是"+getCountries());
    }
}
