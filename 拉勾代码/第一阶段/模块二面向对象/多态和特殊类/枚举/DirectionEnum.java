package 多态和特殊类.枚举;

/**
 * @ClassName Direction
 * @Description Enum方式编程实现所有方向的枚举
 * @Author Kevin
 * @Date 2021/6/18 10:14 下午
 */
public enum DirectionEnum implements DirectionInterface {
    //匿名内部类语法格式：接口/父类类型引用变量名=new 接口/父类类型(){方法的重写}
    //方式二
    UP("向上"){
        @Override
        public void show() {
            System.out.println("向上走");
        }
    },DOWN("向下") {
        @Override
        public void show() {
            System.out.println("向下走");
        }
    },LEFT("向左") {
        @Override
        public void show() {
            System.out.println("向左走");
        }
    },RIGHT("向右") {
        @Override
        public void show() {
            System.out.println("向右走");
        }
    };
    private final String dsc;    //用于描述方向字符的成员变量



    /**
     * 使用构造方法初始化，更加灵活
     * 1.私有化构造方法,此时该构造方法只能在本类的内部使用
     *
     */
    private DirectionEnum(String dsc) {
        this.dsc = dsc;
    }


    //通过共有get方法，可以让本类外部访问该类的成员变量的数值
    public String getDsc() {

        return dsc;
    }

    //整个枚举类型只重写一次，多个对象调用同一个方式
    //方式一
//    @Override
//    public void show() {
//        System.out.println("重写后的show方法");
//    }
}
