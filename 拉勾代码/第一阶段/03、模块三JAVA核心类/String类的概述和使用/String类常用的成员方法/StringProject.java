package String类的概述和使用.String类常用的成员方法;

import java.util.Scanner;

public class StringProject {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("请输入账号和密码：");

            String user = sc.next();
            String pwd = sc.next();

            if ("admin".equals(user) && "12345".equals(pwd)) {
                System.out.println("密码正确，登录成功");
                break;
            }
            if (i == 1) {
                System.out.println("账户冻结");
            } else {

                System.out.println("您还有" + (i - 1) + "次机会");

            }


        }
        //关闭扫描器
        sc.close();


    }
}
