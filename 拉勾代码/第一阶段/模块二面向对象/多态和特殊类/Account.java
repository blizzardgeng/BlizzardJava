package 第一阶段.模块二面向对象.多态和特殊类;

/**
 * @author blizzard
 */
public abstract class Account {

    private int money;

    public Account() {
    }

    public Account(int money) {
        setMoney(money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money > 0) {
            this.money = money;
        } else {
            System.out.println("输入金额不正确");
        }

    }

    public abstract double getLixi();

}
