package 网络编程.TCP.基础实现;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStringTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        try {
//        1、创建ServerSocket类型对象并提供端口号
            ss = new ServerSocket(8888);
//        2、等待客户端连接请求，调用accept方法
            System.out.println("等待客户端的连接请求");
            s = ss.accept();

            System.out.println("客户端连接成功");
//        3、使用输入输出刘进行通信
            //显示客户端发送过来的字符串内容接收
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String s1 = br.readLine();
            System.out.println("获取到的内容是");
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
            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
//        4、关闭ServerSocket并释放所有资源



    }
}
