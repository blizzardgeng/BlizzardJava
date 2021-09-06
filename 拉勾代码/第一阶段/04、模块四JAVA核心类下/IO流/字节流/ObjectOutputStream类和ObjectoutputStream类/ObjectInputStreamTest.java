package IO流.字节流.ObjectOutputStream类和ObjectoutputStream类;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectInputStream ois = null;

        try {
//        1、创建一个ObjectInputStream类型对象并关联d:/a.txt文件
            ois = new ObjectInputStream(new FileInputStream("d:/a.txt"));
//        2、读取文件内容并打印
            Object readObject = ois.readObject();
            System.out.println("对象是"+readObject);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (null != ois) {
                //        3、关闭文件
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
