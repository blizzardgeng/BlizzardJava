package 设计模式的概念和分类.装饰器模式.Project;

public class UpgradePerson implements PersonInterface{
    private Person person;

    public UpgradePerson(Person p) {
        this.person = p;
    }

    @Override
    public void method() {
        person.method();
        System.out.println("新增加的方法");
    }
}
