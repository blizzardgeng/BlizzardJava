package 网络编程.URL类;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class UrlTest {
    public static void main(String[] args) {

//        1、使用参数指定的字符串构造对象
        URL url = null;
        try {
            url = new URL("https://www.baidu.com/");

            //        2、获取相关的信息打印
            System.out.println("获取到的协议名称是" + url.getProtocol());
            System.out.println("获取到的主机名称是" + url.getHost());
            System.out.println("获取到的端口号是" + url.getPort());         // -1是获取失败
//            3、建立连接并过去相关信息
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);

            }
            br.close();
//            端口连接
           urlConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
