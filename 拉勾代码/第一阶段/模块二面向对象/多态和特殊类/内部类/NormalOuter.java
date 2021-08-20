package 第一阶段.模块二面向对象.多态和特殊类.内部类;

/**
 * @ClassName NormalOuter
 * @Description 编程实现普通内部类的定义和使用
 * @Author Kevin
 * @Date 2021/6/16 10:49 下午
 */
public class NormalOuter {
    private int cnt = 1;

    // 普通定义内部类，属于对象层
    public /*final*/ class NormalInner {
        private int ia = 2;
        private int cnt = 2;

        public NormalInner() {
            System.out.println("普通内部类的构造方法被执行");
        }

        public void show() {
            System.out.println("外部变量cnt数值是" + cnt);
            System.out.println("内部部变量ia数值是" + ia);
        }

        public void show2(int cnt) {
            System.out.println("形参的cnt是"+cnt);  //4。局部优先
            System.out.println("内部类的cnt是"+this.cnt);  //2
            System.out.println("外部类的cnt是"+NormalOuter.this.cnt);//1
        }
    }
}
