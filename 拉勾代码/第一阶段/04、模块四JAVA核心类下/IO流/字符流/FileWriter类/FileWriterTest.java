package IO流.字符流.FileWriter类;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {
        //选中代码后可以使用ctrl+alt+t 来生成异常的捕获代码等
        FileWriter f1 = null;
        try {
            //如果文件不存在，会自动创建内容
            //如果文件存在，会清空文件里面的内容
//        1、构造Filewrite类型的对象与d:/a.txt文件关联
            f1 = new FileWriter("d:/a.txt");
            //以追加的方式打开文件
            //如果文件不存在，会自动创建内容
            //如果文件存在，会保留文件原本内容
//            f1 = new FileWriter("d:/a.txt",true);
//        2、通过对象写入内容 ，每当写入一个字符之后文件的读写位置往后移动一位
            //准备一个字符数组
            char[] cArr = new char[]{'h', 'e', 'l', 'l', 'o'};
            //将数组一部分内容写入
            //写入整个数组
            f1.write(cArr, 1, 3);
            f1.write(cArr);


            f1.write('v');  //写入单个字符
            System.out.println("写入数据成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        3、关闭对象

            try {
                f1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件关闭");


        }


    }
}
