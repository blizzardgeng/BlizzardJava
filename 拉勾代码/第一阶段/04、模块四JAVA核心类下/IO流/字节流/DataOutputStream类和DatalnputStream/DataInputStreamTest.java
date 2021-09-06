package IO流.字节流.DataOutputStream类和DatalnputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {
    public static void main(String[] args) {
        DataInputStream dis = null;

        try {
//        1、创建DataInputStream类型对象指向d:/a.txt文件
            dis = new DataInputStream(new FileInputStream("d:/a.txt"));
//        2、从流中读取一个整数并打印
            int res = dis.readInt();

            System.out.println("读取到的整数是" + res);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
