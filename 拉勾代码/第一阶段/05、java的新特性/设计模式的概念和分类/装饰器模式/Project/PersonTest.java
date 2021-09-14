package 设计模式的概念和分类.装饰器模式.Project;

public class PersonTest {


    public static void main(String[] args) {

        Person p1 = new Person();
        p1.method();
        System.out.println("--------------------------");

        UpgradePerson up = new UpgradePerson(p1);

        up.method();




    }
}
