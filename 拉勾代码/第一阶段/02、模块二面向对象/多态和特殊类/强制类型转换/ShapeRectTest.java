package 多态和特殊类.强制类型转换;

/**
 * @author blizzard
 */
public class ShapeRectTest {
    public static void main(String[] args) {
        //1、声明一个Shape类型应用指向Shape对象并打印特征
        Shape s1 = new Shape(1,2);
        //当Rest没有重写父类方法时，调用的show是父类的show方法
        //当重写show方法后，调用的是Shape中的方法
        s1.show();
        System.out.println("----------------------");
        //2、声明一个Rect类型应用指向Rect对象并打印特征
        //当重写show方法后，调用的是Rect中的方法
        Rect r1 = new Rect(3, 4, 5, 6);
        //当Rest没有重写父类方法时，调用的show是父类的show方法
        //当重写show方法后，调用的是Rect中的方法
        r1.show();
        System.out.println("----------------------");
        //3、声明一个Shape类型应用指向Rect对象并打印特征
        //相当于从Rect类型到hpe类型的转换也就是子类到父类的转换自动类型转换
        Shape sr = new Rect(7, 8, 9, 10);
        //当Rest没有重写父类方法时，调用的show是父类的show方法
        //当重写show方法后，在编译阶段调用父类的代码，在运行阶段调用的是Rect中的方法
        sr.show();
        System.out.println("====================================");
        //4、测试Shape类型引用是否能调用父类和子类独有的方法

        int ia = sr.getX();
        System.out.println("获取到的横坐标是"+ia);

        //sr.getL()   error Shape类中zh找不到getL()方法，也就是在shape类中

        //调用静态方法
        Shape.test();

        System.out.println("-------------------------");
        //5、使用父类类型引用，调用子类类型独有的方法
        //相当于从 Shape联型到Rect类型的转换,也就是父类到子类的转换大到小的转换强制类型转换
        int i = ((Rect) sr).getL();
        System.out.println("长度是"+i);

        //将Shape类型强制转换成Circle类型
        //Circle c1 = (Circle) sr;  //编译可以，但是运行时候会发现类型转换异常

        //在强制类型转换前，用instanceof判断类型
        //判断sr在堆区内存中指向堆对象是否是Circle
        if (sr instanceof Circle) {
            System.out.println("可以转换");
        } else {
            System.out.println("强转有风险");
        }




    }
}
