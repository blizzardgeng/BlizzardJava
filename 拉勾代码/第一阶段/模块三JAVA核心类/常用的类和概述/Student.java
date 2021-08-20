package 第一阶段.模块三JAVA核心类.常用的类和概述;

public class Student {
    private int id;   //描述学生id
    private String name;       //描述学生姓名

    public int getId() {
        return id;
    }

    public Student(int id, String name) {
        setId(id);
        setName(name);

    }

    public Student() {
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("学号错误");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
