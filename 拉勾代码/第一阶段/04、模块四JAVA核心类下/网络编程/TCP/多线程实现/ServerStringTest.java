package 网络编程.TCP.多线程实现;

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


        try {
//        1、创建ServerSocket类型对象并提供端口号
            ss = new ServerSocket(8888);
//        2、等待客户端连接请求，调用accept方法
            while (true) {


                System.out.println("等待客户端的连接请求");
                s = ss.accept();

                System.out.println("客户端" + s.getInetAddress() +"连接成功");
                //没当一个客户端启动成功，都需要启动一个新的线程来操作

                new ServerThread(s).start();

            }
//
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

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
