package 反射机制.常用方法;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PersonConstructorTest {

    public static void main(String[] args) throws Exception {
//        1、使用原始形式以无参的方式构造对象并打印

        Person p1 = new Person();
        System.out.println("无参方式构建的对象：" + p1);
        System.out.println("---------------------------------------");
//        2、使用反射机制以无参的方式构造对象并打印
        //使用用户输入方式动态创建
//        System.out.println("请输入要创建对象的类型：");
//        Scanner sc = new Scanner(System.in);
//        String next = sc.next();

        //使用文件内容读取方式获取
//        BufferedReader br = new BufferedReader(new FileReader("d:/a.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("d:/a.txt")));
        String next = br.readLine();
        System.out.println("获取到的内容是"+next);
        Class c1 =  Class.forName(next);
        System.out.println("使用反射机制无参构建的对象是:" + c1.newInstance());

//反射机制.常用方法.Person
    }

}
