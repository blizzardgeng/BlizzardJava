package 设计模式的概念和分类.工厂模式.多个工厂模式;

public class SenderFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }


}
