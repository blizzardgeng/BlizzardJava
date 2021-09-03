package 异常机制和File类.异常.异常的抛出;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionThrowsTest {

    public static void show() throws IOException {
        FileInputStream fis = new FileInputStream("d:/a.txt");
        fis.close();

    }

    //不建议在main方法抛出异常
    public static void main(String[] args) {
        try {
            show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("结束");

    }
}
