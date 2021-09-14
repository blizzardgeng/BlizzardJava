package 设计模式的概念和分类.工厂模式.抽象工厂类.Project;

public class SmsSender implements Sender{


    @Override
    public void send() {
        System.out.println("短信发送");
    }
}
