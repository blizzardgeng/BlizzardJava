package 网络编程.TCP.基础实现.测试编写;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket accept = null;
        try {
//        1、创建服务器
            ss = new ServerSocket(8888);

//        2、等待链接;
            System.out.println("等待链接");
            accept = ss.accept();
//            接受信息并打印
            BufferedReader bf = new BufferedReader(new InputStreamReader(accept.getInputStream()));
            System.out.println("获取到的内容是" + bf.readLine());

            System.out.println("🔗成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != accept) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//        3、结束;

    }
}
