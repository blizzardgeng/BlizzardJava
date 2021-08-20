package 第一阶段.模块二面向对象.特殊类.枚举.正常枚举;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/18 14:12:59
 */
public enum Person {
    UP("向上"),DOWN("向下");

    private String dsc;

    private Person(String dsc) {
        this.dsc = dsc;
    }


    public String getDsc() {
        return dsc;
    }
}
