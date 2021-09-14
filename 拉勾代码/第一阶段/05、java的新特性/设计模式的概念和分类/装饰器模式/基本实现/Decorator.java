package 设计模式的概念和分类.装饰器模式.基本实现;

public class Decorator implements Sourceable {

    private Sourceable sourceable;

    public Decorator(Sourceable sourceable) {
        this.sourceable = sourceable;
    }


    @Override
    public void method() {
        sourceable.method();       //保证原有功能不变
        System.out.println("增加新功能");


    }


}
