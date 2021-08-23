package 数组和应用;

/**
 * @author blizzard
 */
public class IntListDemo {
    public static void main(String[] args) {
        //申明一个长度是5的int类型list
        int[] listData = new int[5];
        for (int listDatum : listData) {
            //默认是0
            System.out.println(listDatum);
        }

        listData[0] = 55;
        listData[1] = 66;
        listData[2] = 77;
        listData[3] = 88;
        for (int listDatum : listData) {
            System.out.println(listDatum);
        }
        System.out.println("---------增加");
        //将33插入到下表0的位置
        for (int i = 4; i > 0; i--) {
            listData[i] = listData[i - 1];
        }
        listData[0] = 33;
        for (int listDatum : listData) {
            System.out.println(listDatum);
        }
        System.out.println("--------------减少");
        for (int i = 0; i < listData.length-1; i++) {
            listData[i] = listData[i + 1];
        }

        for (int listDatum : listData) {
            System.out.println(listDatum);
        }
        System.out.println("----------修改");
        for (int i = 0; i < listData.length; i++) {
            if (listData[i] == 66) {
                listData[i] = 660;
                break;
            }
        }
        for (int listDatum : listData) {
            System.out.println(listDatum);
        }

    }
}
