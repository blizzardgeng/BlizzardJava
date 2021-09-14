package 设计模式的概念和分类.工厂模式.抽象工厂类;

public class PacketSenderFactory implements Provider{
    @Override
    public Sender produce() {
        return new PacketSender();
    }
}
