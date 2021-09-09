package 网络编程.TCP.键盘输入发送内容;

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
            //实现客户端像服务器发送字符串
            System.out.println("请输入需要发送的内容：");
            ps = new PrintStream(s.getOutputStream());
            ps.println(sc.next());
            System.out.println("发送信息成功");
            //接受服务器信息
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("服务器返回的内容是"+br.readLine());
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
