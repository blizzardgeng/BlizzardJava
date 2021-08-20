package 第一阶段.模块二面向对象.多态和特殊类.强制类型转换;

/**
 * @author blizzard
 */
public class Rect extends Shape {

    private int l;
    private int w;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        if (l > 0) {
            this.l = l;
        } else {
            System.out.println("长度不合理");
        }

    }

    public int getW() {
        return w;
    }

    public Rect(int l, int w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("长度是"+getL()+",宽度是"+getW());
    }

    public Rect(int x, int y, int l, int w) {
        super(x, y);
        setL(l);
        setW(w);

    }

    public void setW(int w) {
        if (w > 0) {
            this.w = w;
        } else {
            System.out.println("宽度不合理");
        }

    }

    //自定义静态方法
    public static void test() {
        System.out.println("Rect中的静态方法");
    }
}
