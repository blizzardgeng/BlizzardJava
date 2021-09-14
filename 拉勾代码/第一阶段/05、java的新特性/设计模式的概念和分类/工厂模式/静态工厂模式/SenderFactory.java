package 设计模式的概念和分类.工厂模式.静态工厂模式;

public class SenderFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }


}
