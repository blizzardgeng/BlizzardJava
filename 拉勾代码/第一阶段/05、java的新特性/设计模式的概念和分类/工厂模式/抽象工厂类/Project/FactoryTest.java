package 设计模式的概念和分类.工厂模式.抽象工厂类.Project;

public class FactoryTest {
    public static void main(String[] args) {

        Factory f1 = new EmailFactory();
        Sender produce = f1.produce();
        produce.send();

    }
}
