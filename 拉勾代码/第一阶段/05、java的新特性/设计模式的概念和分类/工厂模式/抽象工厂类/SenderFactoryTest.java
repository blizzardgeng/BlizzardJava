package 设计模式的概念和分类.工厂模式.抽象工厂类;

public class SenderFactoryTest {
    public static void main(String[] args) {

//        缺点：代码复杂，可读性差
//        有点：扩展性和可维护性更强，尤其是在创建大量代码下
//        1、声明工厂类的引用指向工厂类型的对象

//      2、调用生产方法实现对象的创建
        Provider provider = new SmsSenderFactory();

//        3、使用对象调用方法

        Sender sender = provider.produce();
        sender.send();

        System.out.println("-------------------------------------");
        //优点：代码简单可读性强
//        缺点：扩展性差和可维护性差
        Sender s1 = new MailSender();
        s1.send();

        System.out.println("增加发送包裹方法");

        Provider provider1 = new PacketSenderFactory();
        Sender produce = provider1.produce();
        produce.send();

    }
}
