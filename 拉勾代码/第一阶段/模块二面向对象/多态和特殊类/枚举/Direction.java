package 多态和特殊类.枚举;

/**
 * @ClassName Direction
 * @Description 编程实现所有方向的枚举
 * @Author Kevin
 * @Date 2021/6/18 10:14 下午
 */
public class Direction {
    private final String dsc;    //用于描述方向字符的成员变量

    //2.声明本类类型的引用指向本类类型的对象
    public final static Direction UP = new Direction("向上 ");
    public final static Direction DOWN = new Direction("向下 ");
    public final static Direction LEFT = new Direction("向左 ");
    public final static Direction RIGHT = new Direction("向右 ");

    /**
     * 使用构造方法初始化，更加灵活
     * 1.私有化构造方法,此时该构造方法只能在本类的内部使用
     *
     */
    private Direction(String dsc) {
        this.dsc = dsc;
    }


    //通过共有get方法，可以让本类外部访问该类的成员变量的数值
    public String getDsc() {
        return dsc;
    }



}
