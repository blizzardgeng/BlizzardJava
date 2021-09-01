package 集合类上.collection接口;

public class TestDemo {

    public static void main(String[] args) {
        TestObject t1 = new TestObject("张飞", 30);

        System.out.println(t1.equals(new TestObject("张飞", 30)));
    }
}
