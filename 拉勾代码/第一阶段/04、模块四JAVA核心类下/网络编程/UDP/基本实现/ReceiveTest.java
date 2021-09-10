package 网络编程.UDP.基本实现;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveTest {
    public static void main(String[] args) {
        DatagramSocket ds = null;

        try {
//        1、创建DatagramSocket类型的对象，并提供端口号
            ds = new DatagramSocket(8888);
//        2、创建DatagramPacket类型的对象并提供缓存区
            byte[] bArr = new byte[20];
            DatagramPacket dp = new DatagramPacket(bArr, bArr.length);
//        3、通过Socket接收数据的内容放到Packet里面，调用receive方法
            System.out.println("等待数据接收");
            ds.receive(dp);
            System.out.println("接收到的内容是" + new String(bArr,0, dp.getLength()) + "!");
            //实现将字符串内容回发过去
            byte[] bArr2 = "ok".getBytes();
            DatagramPacket dp2 = new DatagramPacket(bArr2, bArr2.length, dp.getAddress(), dp.getPort());
            ds.send(dp2);
            System.out.println("回发数据成功");

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
