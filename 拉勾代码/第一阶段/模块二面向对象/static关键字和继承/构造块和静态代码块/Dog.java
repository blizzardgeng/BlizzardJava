package static关键字和继承.构造块和静态代码块;

import 第一阶段.模块二面向对象.static关键字和继承.Animal;

/**
 * @author : Kevin Geng
 * @ClassName ：Dog
 * @date : 2021/6/4 11:52 下午
 */
public class Dog extends Animal {

    private int tooth;

    public int getTooth() {
        return tooth;
    }

    public Dog(String name, String color, int tooth) {
        super(name, color);
        this.tooth = tooth;

    }


    public Dog() {
    }

    public void setTooth(int tooth) {
        if (tooth > 0) {
            this.tooth = tooth;
        } else {
            System.out.println("牙齿数量不合理");
        }

    }

    @Override
    public void show() {
        super.show();
        System.out.println("牙齿数量是"+getTooth());
    }
}
