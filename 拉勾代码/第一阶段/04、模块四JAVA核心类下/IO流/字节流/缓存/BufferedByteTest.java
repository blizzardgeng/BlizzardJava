package IO流.字节流.缓存;

import java.io.*;

public class BufferedByteTest {
    public static void main(String[] args) {
        BufferedInputStream bfi = null;
        BufferedOutputStream bfo = null;
        try {
//        1、创建BufferedInputStream类型文件
            bfi = new BufferedInputStream(new FileInputStream("d:/123.mp4"));
//        2、创建BufferedOutputStream类型文件
            bfo = new BufferedOutputStream(new FileOutputStream("d:/321.mp4"));

            byte[] bArr = new byte[1024];
            int res = 0;

//            自己提供的缓冲区，可以不用提供
            while ((res = bfi.read(bArr)) != -1) {
                bfo.write(bArr, 0, res);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //        关闭
            if (null != bfo) {
                try {
                    bfo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != bfo) {
                try {
                    bfi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }



    }
}
