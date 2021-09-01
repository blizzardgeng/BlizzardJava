package 集合类上.collection接口.Queue接口;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
//        1.准备一个Queue美合并打印
        Queue q1 = new LinkedList();
        System.out.println(q1);
//        2.将数据11、22、33、44、55在次入队并打印

        for (int i = 1; i <= 5; i++) {
            q1.offer(i * 11);
        }
        System.out.println("添加完参数"+q1);
//        3.然后查看队首元素并打印
        System.out.println("q1收个元素是"+q1.peek());
//        4.然后符队列中所有数据依次出队并打印
        int len = q1.size();
        for (int i = 1; i <= len; i++) {
            System.out.println("出来的元素是" + q1.poll());

        }

//        5.查看队列中最终的元素
        System.out.println("队列中的元素有"+q1);

        List s1 = new LinkedList();
        Collection s2 = new LinkedList();
    }
}
