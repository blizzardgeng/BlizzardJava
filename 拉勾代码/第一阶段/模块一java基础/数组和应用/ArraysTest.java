package 数组和应用;

import java.util.Arrays;

/**
 * @author blizzard
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arrList = {10, 20, 30, 40, 50};
        //原始方法
        System.out.println("["+arrList[0]+","+arrList[1]+","+arrList[2]+","+arrList[3]+","+arrList[4]+"]");

        System.out.println("----------------");
//        arrays方法-打印-toString
        System.out.println(Arrays.toString(arrList));
        System.out.println("---------------");
//        arrays方法-元素填充-fill
        int[] arr2 = new int[5];
        Arrays.fill(arr2, 10);
        System.out.println(Arrays.toString(arr2));
        System.out.println("------------");
//        arrays方法-数组判断(只有元素和长度顺序完全相同才一样)-equals
        int[] arr3 = new int[5];
        Arrays.fill(arr3, 10);

        if (Arrays.equals(arr2, arr3)) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }
        System.out.println("-----------------");
//        arrays方法-排序，最小的在最左边-查找数组中最小的值-sout
//        arrays方法--查找数组中指定元素所在的位置-binary Search




    }
}
