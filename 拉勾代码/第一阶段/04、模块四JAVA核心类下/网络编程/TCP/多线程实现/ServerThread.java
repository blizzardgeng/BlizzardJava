package 网络编程.TCP.多线程实现;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class ServerThread extends Thread {

    private Socket s;

    ServerThread(Socket s) {
        this.s = s;
    }


    @Override
    public void run() {
        BufferedReader br = null;
        PrintStream ps = null;

        try {

            while (true) {
//        3、使用输入输出刘进行通信
                //显示客户端发送过来的字符串内容接收
                br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                //如果客户端没有发送信息，则会一直阻塞
                String s1 = br.readLine();
                InetAddress inetAddress = s.getInetAddress();
                System.out.println("获取到" + inetAddress +"的内容是" + s1);
                if ("bay".equals(s1) || "再见".equals(s1)) {
                    System.out.println("客户端" + inetAddress+"下线");
                    break;

                }
                //实现客户端向服务器发送
                ps = new PrintStream(s.getOutputStream());
                ps.println("收到信息啦");
                System.out.println("服务器回发信息成功");
            }
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
        }
    }
}
