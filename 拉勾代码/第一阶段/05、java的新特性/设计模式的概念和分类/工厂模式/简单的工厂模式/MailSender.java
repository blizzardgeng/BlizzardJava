package 设计模式的概念和分类.工厂模式.简单的工厂模式;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("发送邮件成功");
    }
}
