package 特殊类.枚举.枚举其他参数方法;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/18 15:22:25
 */
public enum Person {

    UP("向上"),DOWN("向下"),LEFT("向左"),RIGHT("向下");

    private String dsc;

    private Person(String dsc) {
        this.dsc = dsc;

    }

    public String getDsc() {
        return dsc;
    }
}
