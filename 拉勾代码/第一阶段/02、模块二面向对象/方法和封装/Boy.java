package 方法和封装;

/**
 * @author : Kevin Geng
 * @date : 2021/5/30 11:24 下午
 */
public class Boy {
    String name;

    //自定义构造方法
    Boy() {
//        this("无名");
        System.out.println("无参数方法");

    }

    Boy(String name) {
        this();
        System.out.println("有参数方法");
        this.name = name;
    }

    void show() {

        System.out.println("我的名字是"+name);
    }

    public static void main(String[] args) {
        //使用无参方式打印特征
        Boy b1 = new Boy();
        b1.show();
        System.out.println("--------------------");
        //使用有参方式打印特征
        Boy b2 = new Boy("张飞");
        b2.show();
    }
}
