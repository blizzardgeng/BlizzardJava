package 设计模式的概念和分类.工厂模式.抽象工厂类;

public class SmsSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
