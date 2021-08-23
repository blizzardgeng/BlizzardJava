package 特殊类.枚举.枚举Switch;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/18 15:01:35
 * 定义指定的对象，判断对象的内容，java的switch支持enum直接使用
 */
public enum Person {

    UP("向上"),DOWN("向下"),LEFT("向左"), RIGHT("向右");

    private String dsc;

    private Person(String dsc) {
        this.dsc = dsc;
    }


    public String getDsc() {
        return dsc;
    }


}
