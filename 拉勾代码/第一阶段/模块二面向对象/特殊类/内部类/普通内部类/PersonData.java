package 第一阶段.模块二面向对象.特殊类.内部类.普通内部类;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/18 17:10:34
 */
public class PersonData {
    private int cnt = 1;

    public class InnerData {
        private int cnt = 2;
        private int dsc = 2;


        public InnerData() {
            System.out.println("运行了内部类的构造方法");
        }

        public void show() {
            System.out.println("内部变量cnt的值是"+cnt);
            System.out.println("内部变量dsc的值是"+dsc);
        }

        public void show2() {
            System.out.println("形参的cnt是"+cnt);  //4。局部优先
            System.out.println("内部变量cnt的值是"+this.cnt);
            System.out.println("外部变量cnt的值是"+PersonData.this.cnt);
        }
    }




}
