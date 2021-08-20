package 第一阶段.模块二面向对象.类和对象.可变长参数;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/17 17:35:08
 */
public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        System.out.println("构造方法");
    }

    public void show(String... dataList) {
        for (int i = 0; i < dataList.length; i++) {
            System.out.println("当前位置是" + (i+1)+",参数是"+dataList[i]);

        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.show("哈哈","呵呵","yoyo");
    }



}
