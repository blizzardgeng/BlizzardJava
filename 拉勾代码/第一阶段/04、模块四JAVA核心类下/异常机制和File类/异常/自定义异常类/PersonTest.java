package 异常机制和File类.异常.自定义异常类;

public class PersonTest {
    public static void main(String[] args) {


        Person p1 = null;
        try {
            p1 = new Person("张飞", -30);
        } catch (AgeException e) {
            e.printStackTrace();
        }
        System.out.println("p1 = " + p1);


        //抛上来的异常不会创建对象，如果在异常地点处理了就会运行创建对象

    }
}
