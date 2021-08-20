package 第一阶段.模块一java基础.流程控制;

import java.util.Scanner;

/**
 * @author blizzard
 */
public class BreakDemo {
    public static void main(String[] args) {

        //通过boolean类型判断是谁说
        boolean flag = true;
        for (; ; ) {
            //使用三元运算符选择内容
            System.out.print("请"+(flag?"张三":"李四")+"输入内容:");
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            if ("bay".equals(str)) {
                System.out.println("好的。再见");
                break;
            }
            System.out.println( (flag?"张三":"李四")+"说"+str);
            //boolean取反
            flag = !flag;

        }
    }
}
