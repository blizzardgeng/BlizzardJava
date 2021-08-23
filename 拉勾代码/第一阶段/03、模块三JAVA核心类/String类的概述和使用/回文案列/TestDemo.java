package String类的概述和使用.回文案列;

public class TestDemo {
    public static void main(String[] args) {
//        1、将字符前后转换
        String str1 = "上海自来水来自海上12";
        char[] cStr1 = str1.toCharArray();

//        2、对比判断
        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(i) != str1.charAt(str1.length() - i - 1)) {
                System.out.println(str1 +  "不是回文");
                return;   //用于实现方法结束
            }

        }
        System.out.println(str1 + "是回文");
    }
}

