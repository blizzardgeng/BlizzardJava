package 多态和特殊类.强制类型转换;

/**
 * @author blizzard
 */
public class Shape {

    private int x;
    private int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void show() {
        System.out.println("Shape类,x是" + x + "，y是" + y);
    }

    //自定义静态方法
    public static void test() {
        System.out.println("Shape中的静态方法");
    }
}
