package 设计模式的概念和分类.单例模式;

public class Person {

    //2.声明本类类型到的引用指向本类类型的对象并使用private static关键字修饰

    private static Person s = null;

    //1.私有化构造方法，使用private关键字修饰

    private   Person() {
    }


    //3.是供么公有的get方法负贡将上还对貌这回出去，并使用public static关键字修饼

    public static synchronized Person getObj() {
        if (null == s) {
            s = new Person();
        }

        return s;
    }


}
