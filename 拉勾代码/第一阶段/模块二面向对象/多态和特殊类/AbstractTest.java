package 多态和特殊类;

/**
 * @author blizzard
 */
public abstract class AbstractTest {
    private int cnt;

    public AbstractTest() {
    }

    public AbstractTest(int cnt) {
        setCnt(cnt);
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }


    //自定义抽象方法
    public abstract void show();


    public static void main(String[] args) {
        /*AbstractTest as = new AbstractTest();
        System.out.println("cnt = "+as.cnt)*/;
    }
}
