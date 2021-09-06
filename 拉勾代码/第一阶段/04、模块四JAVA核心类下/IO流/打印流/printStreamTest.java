package IO流.打印流;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class printStreamTest {

    public static void main(String[] args) {
        //由手册可知：构造方法需要的是Reader类型的引用，但Reader类是个抽童类，实参只能传递子类的对象       字符流
        //由手册可知：System.int表键盘输入，而且是Inputstream类型的       字节流
        BufferedReader br = null;
        PrintStream ps = null;
        boolean name = true;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            ps = new PrintStream(new FileOutputStream("d:/a.txt"));
            while (true) {


    //        1.提示用户输入要发送的聊天内容并使用变量记录
                System.out.println("请 " + (name?"张三":"李四")+"输入聊天记录");
    //        2、判断用户输的内容是否为"bye”，若是则聊天结束"
                String str = br.readLine();

                if ("bys".equals(str)) {
                    System.out.println("聊天结束");
                    break;
                }
    //        3、若不是则翔用户输入的内容写入到文件d:/a.txt中
                else {
                    Date d1 = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String time = sdf.format(d1);
                    ps.println(time + (name?" 张三说：":" 李四说") + str);
                    name = !name;

                }

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
        }


    }
}
