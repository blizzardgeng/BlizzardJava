package 第一阶段.模块二面向对象.多态和特殊类;

public class FixedAccount extends Account {

    @Override
    public double getLixi() {
        //利息=本金*利息*时间
        return getMoney() * 0.03 * 1;

    }

    public FixedAccount(int money) {
        super(money);
    }

    public FixedAccount() {
    }

    public static void main(String[] args) {
        //1、声明一个Account类型引用指向子类对象，形成多态
//        Account acc = new FixedAccount(1000);
        FixedAccount acc = new FixedAccount();
        acc.setMoney(1000);
        double liXi = acc.getLixi();
        System.out.println("利息是"+liXi);




    }
}
