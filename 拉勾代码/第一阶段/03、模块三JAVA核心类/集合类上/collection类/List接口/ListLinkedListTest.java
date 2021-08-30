package 集合类上.collection类.List接口;

import java.util.LinkedList;
import java.util.List;

public class ListLinkedListTest {
    public static void main(String[] args) {

        List lt1 = new LinkedList();
        System.out.println("lt1 = "+lt1);
        System.out.println("--------------------------------------");

        lt1.add(0, "one");
        System.out.println("lt1 = "+lt1);

        lt1.add(1, 3);
        System.out.println("lt1 = "+lt1);

        lt1.add(1, "two");
        System.out.println("lt1 = "+lt1);

        System.out.println("--------------------------------------");
        String str1 = (String) lt1.get(0);
        System.out.println("获取到的元素是"+str1);
//        获取元素并进行强制转换时一定要净胜
//        String str2 = (String) lt1.get(2);
//        System.out.println("获取到的元素是"+str2);

        System.out.println("--------------------------------------");
//        4、使用get方法获取集合中所有对象并打印
        StringBuilder strArr = new StringBuilder();
        strArr.append("[");
        for (int i = 0; i < lt1.size(); i++) {
            Object obj = lt1.get(i);

            if (lt1.size() - 1 == i) {
                strArr.append(obj).append("]");
            } else {
                strArr.append(obj).append(", ");
            }
            
        }
        System.out.println(strArr.toString());
        System.out.println("--------------------------------------");
//        5、查找指定元素出现的位置
        System.out.println("one第一次出现的索引位置是" + lt1.indexOf("one"));          //one第一次出现的索引位置是0
        lt1.add("one");
        System.out.println("反向");
        System.out.println("one第一次出现的索引位置是" + lt1.lastIndexOf("one"));          //one第一次出现的索引位置是3

        System.out.println("--------------------------------------");
//        6、实现元素中的修改
        Integer it1 = (Integer) lt1.set(2, "three");
        System.out.println("被修改的内容是"+it1);
        System.out.println("修改后集合有"+lt1);

        String str2 = (String) lt1.set(3, "four");
        System.out.println("被修改的内容是"+str2);
        System.out.println("修改后集合有"+lt1);
        System.out.println("--------------------------------------");

//        7、使用remove方法删除集合中所有元素
//        for (int i = 0; i < lt1.size(); /*i++*/) {
//
//            Object obj = lt1.remove(0);
//            System.out.println("被删除的元素是"+ obj   );
//
//        }
//        System.out.println("删除完成后"+lt1);
//        8、获取子集合,子集合和当前集合公用同一个内存空间
        //表示从当前集合中获取下标1到下标3的元素，包含1，但不包含3
        List lt2 = lt1.subList(1, 3);
        System.out.println("lt2 = "+lt2);


    }
}
