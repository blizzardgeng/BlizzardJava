package String类的概述和使用.正则表达式;

import java.util.Scanner;

public class StringRegTest {

    public static void main(String[] args) {
//        1、定义描述规则的正则表达式字符串
//        String reg = "^[0-9]{6}$";
        //银行卡规则
//        String reg = "^\\d{6}$";
//        qq账号规则，长度5-15，开头不能是0
//        String reg = "[1-9]\\d{4,15}";
//            手机号规则，长度13，开头是1
//        String reg = "1[34578]\\d{9}";
//        身份证号码规则
        String reg = "(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9|Z])";
//        2、提示用户从键盘输入指定内容并使用变量记录
        System.out.println("请输入密码");
        Scanner sc = new Scanner(System.in);
        while (true) {




        String str = sc.next();
//        3、判断用户输入的内容是否匹配
        if (str.matches(reg)) {
            System.out.println("正确");
            break;
        } else {
            System.out.println("错误,清重新输入");
        }
        }
        sc.close();
    }
}
