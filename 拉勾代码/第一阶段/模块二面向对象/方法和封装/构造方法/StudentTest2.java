package 方法和封装.构造方法;

import 方法和封装.构造方法.Student;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Kevin Geng
 * @ClassName ：StudentTest2
 * @date : 2021/5/31 11:19 下午
 */
public class StudentTest2 {

    public static void main(String[] args) {



//    1提示用户输入学生的人数
        System.out.println("请输入人数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//    2根据学生的人数准备数组
        Student[] students = new Student[num];
//    3提示每个用户的学生资料并记录
        for (int i = 1; i <= num; i++) {
            System.out.println("请输入第"+i+"个学生姓名和年龄");
            students[i-1] = new Student(sc.nextInt(),sc.next());
        }
//    4打印
        System.out.println(Arrays.toString(students));
    }
}
