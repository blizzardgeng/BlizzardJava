package IO流.字节流.拷贝案例;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteCopyTest {
    public static void main(String[] args) {
        FileInputStream fi = null;
        FileOutputStream fo = null;
        try {
//        1、创建FileInputStream类型对象跟文件关联
//            fi = new FileInputStream("d:/123.jpg");
            fi = new FileInputStream("d:/123.mp4");
//        2、创建FileOutputStream类型对象跟文件关联
//            fo = new FileOutputStream("d:/321.jpg");
            fo = new FileOutputStream("d:/321.mp4");
//        3、从输入流中读取内容写入到输出流中
//            拷贝方式一：以单个字节拷贝，每读取一个字节后再写入
//                缺点：文件稍微大点，拷贝效率很低
//            int res = 0;
//            while ((res = fi.read()) != -1) {
//                fo.write(res);
//            }

//            拷贝方式二：准备一个和文件大小一样的缓存区，一次性读取所有的文件内容到缓冲区，然后再一次性写入
//            缺点：若文件过大时，无法申请和文件大小一样的缓存区，真实物理内存不足
//            int len = fi.available();
//            System.out.println("获取到的长度是"+len);
//            byte[] bArr = new byte[len];
//            int res = fi.read(bArr);
//            System.out.println("实际读取到的文件大小是" + res);
//            fo.write(bArr);

//            拷贝方式三：准备一个相对适当的缓冲区，分多次将文件拷贝完，一般用1024的倍数处理
            byte[] bArr = new byte[1024];
            int res = 0;
            while ((res = fi.read(bArr)) != -1) {
                fo.write(bArr, 0, res);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//        4、关闭
            if (null != fo) {
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fi) {
                try {
                    fo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }


    }

}
