package 网络编程.TCP.基础实现;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class ClientStringTest {

    public static void main(String[] args) {
        Socket s = null;
        PrintStream ps = null;
        try {
//        1、创建Socket类型对象并提供主机名和端口号
            s = new Socket("127.0.0.1", 8888);
            System.out.println("连接服务器成功");
//        2、使用输入输出流进行通信
            Thread.sleep(2000);
            //实现客户端像服务器发送字符串
            // ps = new PrintStream(s.getOutputStream());
            ps.println("hello");
//        3、关闭Socket并释放相关资源
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (null != ps) {
                ps.close();
            }

            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }



    }
}
