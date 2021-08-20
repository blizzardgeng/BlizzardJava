package 第一阶段.模块一java基础.数组和应用;

/**
 * @author blizzard
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] arrList1 = {11, 22, 33, 44, 55};
        for (int i = 0; i < arrList1.length; i++) {
            System.out.println(arrList1[i]);
        }
        System.out.println("----------");
        //声明长度是3的元素并且打印所有元素
        int[] arrList2 = new int[3];
        for (int i = 0; i < arrList2 .length; i++) {
            System.out.println(arrList2[i]);
        }

        System.out.println("-------------");
        //将第一个数组的中间三个元素赋值到数组二
//        for (int i = 0; i < arrList2 .length; i++) {
//            arrList2[i] = arrList1[i + 1];
//        }
//        for (int i = 0; i < arrList2 .length; i++) {
//            System.out.println(arrList2[i]);
//        }
        //官方方法
        System.arraycopy(arrList1,1,arrList2,0,3);
        for (int i = 0; i < arrList2 .length; i++) {
            System.out.println(arrList2[i]);
        }
//        4.笔试考点

//        arrList2 = arrList1,表示将变量arrList1的数值赋值给变量arrList2,覆盖变量brr中原来的数值
//        数组名arrList1的内存空间中存放的是数据在堆区中的内存地址信息,赋值后让arrList2变量中存放了arrList1所指向堆区的内存地址
    }
}
