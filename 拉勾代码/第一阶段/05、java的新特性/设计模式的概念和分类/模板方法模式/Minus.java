package 设计模式的概念和分类.模板方法模式;

public class Minus extends AbstractCalculator{
    @Override
    public int calculator(int ia, int ib) {
        return ia - ib;
    }
}
