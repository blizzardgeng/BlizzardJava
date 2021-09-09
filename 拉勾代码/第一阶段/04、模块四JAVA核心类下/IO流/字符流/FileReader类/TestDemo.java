package IO流.字符流.FileReader类;

import java.io.FileReader;
import java.io.IOException;

public class TestDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
//        1、创建关联对象
            fr = new FileReader("/Users/blizzard/Desktop/a.txt");
//        2、读取内容
            int res = 0;
            while ((res = fr.read()) != -1) {
                System.out.println("获取到的内容是" + (char)res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fr) {
                //        3、关闭文件
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
