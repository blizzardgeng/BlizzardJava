package IO流.字符流.缓存;

import IO流.字符流.FileWriter类.FileWriterTest;
import IO流.字节流.缓存.BufferedByteTest;

import java.io.*;

public class BufferedCharType {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
//        创建BufferedReader类型对象
            br = new BufferedReader(new FileReader("d:/a.txt"));
//        创建BufferedWriter类型对象
            bw = new BufferedWriter(new FileWriter("d:/b.txt"));
//        从数据中读取一行字符串输出到流中

            String res = null;
            while ((res = br.readLine()) != null) {
                bw.write(res);
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        关闭流对象
            if (null != bw) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != bw) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }




    }

}
