package 网络编程.TCP.键盘输入发送内容;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStringTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        BufferedReader br = null;
        PrintStream ps = null;
        try {
//        1、创建ServerSocket类型对象并提供端口号
            ss = new ServerSocket(8888);
//        2、等待客户端连接请求，调用accept方法
            System.out.println("等待客户端的连接请求");
            s = ss.accept();

            System.out.println("客户端连接成功");
//        3、使用输入输出刘进行通信
            //显示客户端发送过来的字符串内容接收
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            //如果客户端没有发送信息，则会一直阻塞
            String s1 = br.readLine();
            System.out.println("获取到的内容是" + s1);
            //实现客户端向服务器发送
            ps = new PrintStream(s.getOutputStream());
            ps.println("收到信息");
            System.out.println("服务器回发信息成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != ps) {
                ps.close();
            }

            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


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
