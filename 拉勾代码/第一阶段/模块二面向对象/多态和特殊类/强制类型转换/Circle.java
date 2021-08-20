package 第一阶段.模块二面向对象.多态和特殊类.强制类型转换;

public class Circle extends Shape{

    private int ir;

    public Circle() {
    }

    public Circle(int x, int y, int ir) {
        super(x, y);
        setIr(ir);
    }

    public int getIr() {
        return ir;
    }



    public void setIr(int ir) {
        if (ir > 0) {
            this.ir = ir;
        } else {
            System.out.println("半径不合理");
        }

    }

    @Override
    public void show() {
        super.show();
        System.out.println("半径是"+getIr());
    }
}
