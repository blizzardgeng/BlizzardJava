package 设计模式的概念和分类.工厂模式.简单的工厂模式;

public class SenderFactory {

    public Sender produce(String type) {
        System.out.println("随便加一句");
        if ("mail".equals(type)) {
            return new MailSender();
        }
        if ("sms".equals(type)) {
            return new SmsSender();
        }
        return null;
    }


}
