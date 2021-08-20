import java.util.Scanner;

/**
 * @author blizzard
 */
public class Input {


    public static void main(String[] args) {
        String name;
        int age;
        System.out.println("请输入姓名和年龄：");
        Scanner sc = new Scanner(System.in);

        name = sc.next();
        age = sc.nextInt();

        System.out.println("姓名" + name);
        System.out.println("年龄" + age);
    }

}
