package IO流.字符流.FileReader类;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        FileReader f1 = null;
        try {
//        1、构造FileReader类型的对象与d:/a.txt文件关群
            f1 = new FileReader("d:/a.txt");
//        2、读取数据内容并打印  单个读取
//            int res = f1.read();
//            System.out.println("读取的内容是"+(char) res);
            //多个读取
            /*int res = 0;
            while ((res = f1.read()) != -1) {
                System.out.println("读取的内容是"+(char) res);
            }*/

            //准备一个数组来保存读取的内容
            char[] cArr = new char[5];
            //期望读取满数组一部分空间 ,读取3个字符从数组cArr中下标1开的
           /* int res = f1.read(cArr, 1, 3);
            System.out.println("实际读取到的字符个数是"+res);
            for (char cv : cArr
            ) {
                System.out.println("三个读取的字符分别是"+cv  );
            }*/
            //期望读取整个数组
            int res = f1.read(cArr);
            System.out.println("实际读取到的字符个数是"+res);
            for (char cv : cArr
            ) {
                System.out.println("整个读取的字符分别是"+cv  );
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//        3、关闭流并对对象释放有关资源
            if (null != f1) {


            try {
                f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }

    }
}
