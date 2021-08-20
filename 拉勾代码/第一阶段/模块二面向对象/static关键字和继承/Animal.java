package 第一阶段.模块二面向对象.static关键字和继承;

/**
 * @author : Kevin Geng
 * @ClassName ：Animal
 * @date : 2021/6/4 11:37 下午
 */
public class Animal {
    private String name;
    private String color;

    public Animal(String name, String color) {
        setColor(color);
        setName(name);
    }

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println("我的姓名是"+getName()+"，我的颜色是"+getColor());
    }
}
