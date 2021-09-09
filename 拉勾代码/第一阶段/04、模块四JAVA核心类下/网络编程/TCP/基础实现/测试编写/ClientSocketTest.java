package 网络编程.TCP.基础实现.测试编写;

import java.io.*;
import java.net.Socket;

public class ClientSocketTest {

    public static void main(String[] args) {
        BufferedOutputStream fw = null;
        Socket s = null;
        try {
            System.out.println("连接服务器");
            s = new Socket("127.0.0.1", 8888);

//            发送内容

            PrintStream wf = new PrintStream(s.getOutputStream());

            wf.println("hello");

            System.out.println("连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

//        关闭


    }
}
