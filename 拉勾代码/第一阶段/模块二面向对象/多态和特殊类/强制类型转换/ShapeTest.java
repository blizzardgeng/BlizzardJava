package 多态和特殊类.强制类型转换;

import 多态和特殊类.强制类型转换.Circle;
import 多态和特殊类.强制类型转换.Rect;
import 多态和特殊类.强制类型转换.Shape;

/**
 * @author blizzard
 */
public class ShapeTest {

    //自定义成员方法实现将参数指向矩形对象特征打印出来的行为，也就是绘制图新的行为
//    public static void draw(Rect rect) {
//        rect.show();
//    }

    //自定义成员方法实现将参数指向圆形对象特征打印出来的行为，也就是绘制图新的行为
//    public static void draw(Circle circle) {
//        circle.show();
//    }

    //自定义成员方法实现既能打印矩形对象又能打印圆形对象特征，对象由参数传入,因为子类is a 父类
    //多态的使用场景：通过参数传递形成了多态
    //父类类型引用指向子类类型的对象，形成了多态
    public static void draw(Shape shape) {
        //编译阶段掉父类，执行阶段调用父类
        shape.show();
    }


    public static void main(String[] args) {
        draw(new Rect(1, 2, 3, 4));
        System.out.println("----------");
        draw(new Circle(5,6,7));

    }
}
