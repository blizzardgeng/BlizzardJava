package 多态和特殊类.内部类;

/**
 * @ClassName StaticOuter
 * @Description 静态内部类
 * @Author Kevin
 * @Date 2021/6/17 10:51 下午
 */
public class StaticOuter {

    private int cnt = 1;                //属于对象层级
    private static int snt = 2;         //属于类层级

    public static void show() {
        System.out.println("外部类的show方法");
    }

    public static class StaticInner {
        private static int snt = 4;
        private int ia = 3;

        public StaticInner() {
            System.out.println("静态内部类构造方法");
        }

        public void show() {
            System.out.println("静态内部类ia=" + ia);  //3
            System.out.println("外部类中的snt="+snt);  //2
//            System.out.println("外部类中的cnt="+cnt);    //error  静态上下文中不能访问非静态的成员字段

        }

        public void show2(int snt) {
            System.out.println("snt=" + snt);  //5
            System.out.println("内部snt=" + StaticInner.snt);  //4
            System.out.println("外 部snt=" + StaticOuter.snt);  //2
            StaticOuter.show();

        }
    }


}
