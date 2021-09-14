package 设计模式的概念和分类.模板方法模式;

public abstract class AbstractCalculator {

    //    1、自定义成员方法按照参数指定的规则进行切割，并返回计算结果
    public int splitExpression(String exp, String op) {
        System.out.println(exp);
        System.out.println(op);
        String[] sArr = exp.split(op);
        return calculator(Integer.parseInt(sArr[0]), Integer.parseInt(sArr[1]));

    }
//    2、抽象方法，实现运算
    public abstract int calculator(int ia, int ib);


}
