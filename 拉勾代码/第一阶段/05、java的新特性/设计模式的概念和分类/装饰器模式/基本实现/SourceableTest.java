package 设计模式的概念和分类.装饰器模式.基本实现;

public class SourceableTest {
    public static void main(String[] args) {

        Sourceable sb = new Source();
        sb.method();
        System.out.println("-------------------------------------");
//        使用装饰类实现功能
        Sourceable sourceable = new Decorator(sb);
        sourceable.method();


    }
}
