package 设计模式的概念和分类.模板方法模式;

public class AbstractCalculatorTest {
    public static void main(String[] args) {


        AbstractCalculator ac = new Plus();
        int splitExpression = ac.splitExpression("1+1", "\\+");
        System.out.println("最终的运算结果是" + splitExpression);


    }
}
