package 设计模式的概念和分类.工厂模式.抽象工厂类.Project;

public class EmailFactory implements Factory{
    @Override
    public Sender produce() {
        return new EmailSender();
    }
}
