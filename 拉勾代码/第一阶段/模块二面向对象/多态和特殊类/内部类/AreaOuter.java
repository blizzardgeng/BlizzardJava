package 第一阶段.模块二面向对象.多态和特殊类.内部类;

/**
 * @ClassName AreaOuter
 * @Description 局部内部类的定义和使用
 * @Author Kevin
 * @Date 2021/6/17 11:54 下午
 */
public class AreaOuter {
    private int cnt = 1;





    public void show() {
        //    定义一个局部变量,从java8开始默认理解为final关键字修饰的变量
        //虽然可以使用final关键字，但是建议还是加上
        final int ic = 4;
        //定义内部类，内部类只在当前方法体内可以使用
        class AreaInner {
            private int ia = 2;

            public AreaInner() {
                System.out.println("局部内部类构造方法");
            }

            public void test() {
                System.out.println("ia="+ia);      //2
                System.out.println("con="+cnt);   //1
//                ic = 5; error
                System.out.println(ic);
            }

        }
        //声明局部内部类的引用指向局部内部类的对象
        AreaInner ar = new AreaInner();
        ar.test();


    }

}
