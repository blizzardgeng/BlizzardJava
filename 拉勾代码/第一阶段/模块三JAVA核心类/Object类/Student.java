package Object类;

public class Student {

    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        setId(id);
        setName(name);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("不合理id");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * 重写equals方法，为了比较两个学号信息
     */
    @Override
    public boolean equals(Object obj) {
//        当调用对和参数对験指向同一个时,则内容一定相同
        if (this==obj) return true;
//        当调用列乘为不为空而参数对为空时,则内容一定不相同
        if (null == obj) return false;

//        判obj指向的列義是否为 Student类型的对象,若是则条件成立,否则条件不成立
        if (obj instanceof Student) {
            Student s2 = (Student) obj;
            return this.getId() == s2.getId();
        }
        return false;

    }

    /**
     * 为了使得该方法的结築 equals方法的结果保持一致,从而满足java宫方的常协定,需要重写该方法
     */
    @Override
    public int hashCode() {
        return getId();
    }

    /**
     * 为了返回更有意义的数据，需要重新toString方法
     */
    @Override
    public String toString() {
        return "Student[id = " + getId() + ", name = " + getName() + "]";
    }

}
