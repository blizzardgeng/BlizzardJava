package IO流.字符流.拷贝案例;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharCopyTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;

        try {
//        1、创建FileReader类型对象和d:/a.txt关联
            fr = new FileReader("d:/a.txt");

//        2、创建一个FileWriter类型对象
            fw = new FileWriter("d:/b.txt");

//        3、读取写入
            int res = 0;
            while ((res = fr.read()) != -1) {
                fw.write(res);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (null != fw) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fr) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
