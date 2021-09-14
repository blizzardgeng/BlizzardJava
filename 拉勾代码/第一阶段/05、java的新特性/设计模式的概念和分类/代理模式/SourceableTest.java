package 设计模式的概念和分类.代理模式;

public class SourceableTest {
    public static void main(String[] args) {

        Sourceable sourceable = new Proxy();
        sourceable.method();

    }
}
