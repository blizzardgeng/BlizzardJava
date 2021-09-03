package 异常机制和File类.异常.自定义异常类;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) throws AgeException {
        setName(name);
        setAge(age);

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

    public void setAge(int age) throws AgeException {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
//            System.out.println("年龄不合理");
            throw new AgeException("年龄不合理");

        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
