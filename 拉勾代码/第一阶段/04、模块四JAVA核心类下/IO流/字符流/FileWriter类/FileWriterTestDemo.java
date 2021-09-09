package IO流.字符流.FileWriter类;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTestDemo {

    public static void main(String[] args) {
        FileWriter fw = null;
        try {
//        1、查询一个文件
//            fw = new FileWriter("/Users/blizzard/Desktop/a.txt");   //以覆盖的方式打开文件
            fw = new FileWriter("/Users/blizzard/Desktop/a.txt",true);   //以追加的方式打开文件

//        2、写入内容

            fw.write("abc12331");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fw) {
                //        3、关闭文件
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入完成");


    }
}
