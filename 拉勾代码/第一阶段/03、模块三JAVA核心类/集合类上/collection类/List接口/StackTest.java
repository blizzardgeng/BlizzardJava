package 集合类上.collection类.List接口;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

//        1、准备一个stack类型的对象
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println("起始元素" +s1);
//        2、将数据11,22,33,44,55入栈
        for (int i = 1; i < 6; i++) {
            s1.push(i * 11);

        }
        System.out.println("接入元素是"+s1);
        System.out.println("------------------------------------------------------");
//        3、查看栈顶元素值
        Object obj = s1.peek();
        System.out.println("接收到的栈顶元素是"+obj  );


        System.out.println("------------------------------------------------------");
//        4、对栈中所有元素出栈
        int len = s1.size();
        for (int i = 0; i < len; i++) {
            Object to = s1.pop();
            System.out.println("s1出栈的元素是"+to);
            s2.push(to);

        }

        System.out.println("------------------------------------------------------");
//        5、打印栈中所有元素
        int len2 = s2.size();
        for (int i = 0; i < len2; i++) {
            Object to = s2.pop();
            System.out.println("s2出栈的元素是"+to);


        }


    }
}
