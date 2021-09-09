package 网络编程.TCP.多线程实现;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientStringTest {

    public static void main(String[] args) {
        Socket s = null;
        PrintStream ps = null;
        Scanner sc = null;
        BufferedReader br = null;

        try {
//        1、创建Socket类型对象并提供主机名和端口号
            s = new Socket("127.0.0.1", 8888);
            System.out.println("连接服务器成功");
//        2、使用输入输出流进行通信
            sc = new Scanner(System.in);
            ps = new PrintStream(s.getOutputStream());
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            while (true) {
                //实现客户端像服务器发送字符串
                System.out.println("你说：");
                String str1 = sc.next();
                ps.println(str1);
                //判断聊天接受
                if ("bay".equals(str1) || "再见".equals(str1)) {
                    break;
                }

                //接受服务器信息
                System.out.println("服务器说");
                System.out.println(br.readLine());
            }
//        3、关闭Socket并释放相关资源
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
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
