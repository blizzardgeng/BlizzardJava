package 多态和特殊类.注解;


/**
 * Person类Test
 */
@MyAnnotation(value2 = "345")
public class Person {
    private String name;
    private int age;

    /**
     * 编程实现无参构造方法
     */
    @MyAnnotation(value2 = "123")
    public Person() {
    }

    /**
     * 编程实现有参构造方法
     * @param name 上传的名字
     * @param age 上传的年龄
     */
    public Person(String name, int age) {
        setName(name);
        setAge(age);

    }

    /**
     * 获取姓名
     * @return 返回姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     * @param name 上传参数
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年纪
     * @return 返回年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 写入年纪
     * @param age 上传年龄
     */
    public void setAge(int age) {
        this.age = age;
    }
}
