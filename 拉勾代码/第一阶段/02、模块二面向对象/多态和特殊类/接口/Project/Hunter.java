package 多态和特殊类.接口.Project;

//接口只能继承接口，不能继承类
public interface Hunter extends Runner {

    //自定义成员方法描述捕猎行为
    void hunt();

    //将两个方法中默认相同的代码可以提取出来。在方法中调用即可
    default void show() {
        System.out.println("减少重复的代码。");
    }


    //非抽象方法
    default void show1() {
        show();
        System.out.println("show1方法");
    }
    default void show2() {
        show();
        System.out.println("show2方法");
    }



    //增加静态方法
    static void test() {
        System.out.println("静态方法，使用接口名.方法名调用");
    }

}
