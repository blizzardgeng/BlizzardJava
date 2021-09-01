package 集合类下.集合.Collections类;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
//        1、准备一个集合并初始化
        List<Integer> t1 = Arrays.asList(10, 20, 30, 40, 50);

//        2、实现集合中的元素操作
        System.out.println("集合中的最大值是");

        System.out.println("最大值是" + Collections.max(t1));
        System.out.println("最小值是" + Collections.min(t1));


        //实现元素中的反转
        Collections.reverse(t1);
        System.out.println(t1);
        //两个元素的交换
        Collections.swap(t1,0,4);
        System.out.println(t1);
        //实现元素的排序
        Collections.sort(t1);
        System.out.println("排序后的t1 = "+t1);
        //随机置换
        Collections.shuffle(t1);
        System.out.println("随机置换结果是"+t1);
        //实现集合见元素的拷贝
        //表示将t1元素拷贝到t2
        List<Integer> t2 = new LinkedList<Integer>();
        Collections.copy(t2, t1);
        System.out.println("拷贝的元素是"+t2);






    }
}
