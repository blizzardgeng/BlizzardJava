package 集合类上.collection接口.set接口.TreeSet;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
//        return 0;           //返回0表示调用对象和参数对象相等
//        return -1;           //返回-1表示调用对象小于参数对象
//        return 1;           //返回-1表示调用对象大于参数对象
//        return this.getName().compareTo(o.getName());           //比较姓名字符串
//        return this.getAge() - o.getAge();           //比较年龄大小
        int ia = this.getName().compareTo(o.getName());
        return 0 != ia ? ia : this.getAge() - o.getAge();



    }
}
