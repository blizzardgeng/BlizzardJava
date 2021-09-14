package 设计模式的概念和分类.工厂模式.多个工厂模式;

public class SenderFactoryTest {
    public static void main(String[] args) {

//        缺点：代码复杂，可读性差
//        有点：扩展性和可维护性更强，尤其是在创建大量代码下
//        1、声明工厂类的引用指向工厂类型的对象
        SenderFactory sf = new SenderFactory();
//      2、调用生产方法实现对象的创建
        Sender sender = sf.produceMail();
//        3、使用对象调用方法

        sender.send();

        System.out.println("-------------------------------------");
        //优点：代码简单可读性强
//        缺点：扩展性差和可维护性差
        Sender s1 = new MailSender();
        s1.send();

    }
}
