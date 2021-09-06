package IO流.字节流.ObjectOutputStream类和ObjectoutputStream类;

import javax.jws.soap.SOAPBinding;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
//        1、创建objectOutputStream类的对象和d:/a.txt文件关联
            oos = new ObjectOutputStream(new FileOutputStream("d:/a.txt"));
//        2、创建一个user类型对象并初始化\
            User user = new User("zhangfei", "123456", "17788771065");
//        3、将user类型对象写入到输出刘
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != oos) {
                //        4、关闭对象
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }


    }


}
