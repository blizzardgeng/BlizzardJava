package 设计模式的概念和分类.代理模式;

public class Proxy implements Sourceable{
    private Source source;

    public Proxy() {
        source = new Source();
    }

    @Override
    public void method() {
        source.method();
        System.out.println("和装饰器模式不一样");
    }
}
