package 第一阶段.模块二面向对象.多态和特殊类.枚举;

/**
 * @author blizzard
 */

public enum Sex {

    BOY("男孩"), GIRL("女孩");





    private String sex;

    private Sex(String sex) {
        this.sex = sex;
    }

    public String show() {
        return this.sex;
    }

}
