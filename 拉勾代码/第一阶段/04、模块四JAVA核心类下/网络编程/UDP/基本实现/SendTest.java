package 网络编程.UDP.基本实现;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTest {
    public static void main(String[] args) {
        DatagramSocket ds = null;

        try {
//        1、创建DatagramSocket类型的对象, 发送方不需要提供端口号
            ds = new DatagramSocket();
//        2、创建DatagramPacket类型对象，并提供接收方通信地址和端口号
            byte[] bArr = "hello".getBytes();
            DatagramPacket dp = new DatagramPacket(bArr, bArr.length, InetAddress.getLocalHost(), 8888);    //使用getLocalHost获取真实数据长度
//        3、通过Socket发送Packet调用send方法
            ds.send(dp);
            System.out.println("发送数据成功");

            byte[] bArr2 = new byte[20];
            //接收回发的内容
            DatagramPacket dp2 = new DatagramPacket(bArr2, bArr2.length);
            ds.receive(dp2);
            System.out.println("接收到的回发内容是" + new String(bArr2, 0, dp2.getLength()));

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != ds) {
                //        4、关闭Socket并释放相关资源
                ds.close();
            }
        }





    }
}
