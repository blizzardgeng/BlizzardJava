package 设计模式的概念和分类.代理模式;

public class Source implements Sourceable {

    @Override
    public void method() {
        System.out.println("方法调用");
    }
}
