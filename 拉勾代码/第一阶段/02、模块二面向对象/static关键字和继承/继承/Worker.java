package static关键字和继承.继承;

/**
 * @author : Kevin Geng
 * @ClassName ：Worker
 * @date : 2021/6/1 11:48 下午
 */
public class Worker extends Person {

    private int salary;

    Worker() {
        super(); //表示调用父类的无参构造方法,如果没有加，编译器会自动加
        System.out.println("work()");
    }

    //重写父类方法
    Worker(String name, int age, int salary) {
        super(name, age); //表示调用父类的有参构造方法
        System.out.println("work(String,int,int)");
//        setName(name);
//        setAge(age);
        setSalary(salary);
    }


    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 2200) {
            this.salary = salary;
        } else {
            System.out.println("薪水不合理");
        }


    }

    /**
     * 自定义成员方法
     */
    public void work() {
        System.out.println("转头烫手");
    }

    /**
     * 自定show方法，覆盖从父类继承的成员方法
     */
    @Override   //如果没有注解，编译器报错
    void show() {
        super.show();
        System.out.println("我的薪水是" + getSalary() + "岁。");
    }
}
