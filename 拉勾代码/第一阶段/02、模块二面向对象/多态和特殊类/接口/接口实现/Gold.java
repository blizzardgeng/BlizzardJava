package 多态和特殊类.接口.接口实现;

//使用implements表示关系，支持多实现
public class Gold implements Money, Metal {


    @Override
    public void shine() {
        System.out.println("亮度100");

    }

    @Override
    public void buy() {
        System.out.println("花费了很多");

    }

    public static void main(String[] args) {
        //1.声明接口类型的引用指向实现类的对象，形成了多态
        Metal mt = new Gold();
        mt.shine();
        Money mn = new Gold();
        mn.buy();



    }
}
