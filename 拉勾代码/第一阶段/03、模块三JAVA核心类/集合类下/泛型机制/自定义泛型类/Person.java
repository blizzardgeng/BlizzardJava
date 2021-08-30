package 集合类下.泛型机制.自定义泛型类;

/**
 * 自定义泛型类，其中T相当于形式参数负责站位，具体数值由实参决定
 * @param <T> 看做是一种名字是T的数据类型
 */
public class Person<T> {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age, T gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private T gender;

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

    public T getGender() { //当前方法不能使用static关键字修饰，因为T需要在new对象时初始化
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }


    public static <T1> void printArray(T1[] arrData) {
        for (T1 tt : arrData
        ) {
            System.out.println("内容是"+tt);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
