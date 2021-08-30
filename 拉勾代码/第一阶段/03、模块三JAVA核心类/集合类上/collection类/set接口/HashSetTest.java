package 集合类上.collection类.set接口;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> hs1 = new HashSet<>();    //没有先后顺序
//        Set<String> hs1 = new HashSet<>();      //将元素使用双链表连接起来，所以打印有吮吸

        boolean b1 = hs1.add("two");
        System.out.println("b1 = "+b1);
        System.out.println("hs1 = "+hs1);

        b1 = hs1.add("one");
        System.out.println("b1 = "+b1);
        System.out.println("hs1 = "+hs1);

        b1 = hs1.add("three");
        System.out.println("b1 = "+b1);
        System.out.println("hs1 = "+hs1);

        //验证元素不能重复
        b1 = hs1.add("one");
        System.out.println("b1 = "+b1);
        System.out.println("hs1 = "+hs1);




    }
}
