package 异常机制和File类.File类;

import 可变长字符类和时间日期相关类.Java8中日期相关类.LocalDateTimeTest;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class FileTest {

    public static void main(String[] args) throws IOException {
//        1、创建一个File类对象
        File f1 = new File("d:/a.txt");

        if (f1.exists()) {
//            2、如果文件存在，获取文件的相关细节信息/
            System.out.println("文件的名称是" + f1.getName());
            System.out.println("文件的大小是" + f1.length());
            Date ltd = new Date(f1.lastModified());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            System.out.println("文件最后一次修改时间是" + sdf.format(ltd));
            System.out.println("文件的绝对路径信息" + f1.getAbsolutePath());
            System.out.println(f1.delete() ? "删除成功" : "删除失败");
        } else {
//                   3、如果文件不存在就创建新的空文件
            System.out.println(f1.createNewFile()?"文件创建成功":"创建失败");
        }
        System.out.println("---------------------------------------------");
//        4、实现目录的删除创建
        File f2 = new File("d:/测试/测试1/测试2/测试3");
        if (f2.exists()) {
            System.out.println("目录名称是" + f2.getName());
            System.out.println(f2.delete() ? "删除成功" : "删除失败");
        } else {
//            System.out.println( f2.mkdir()?"目录创建成功":"目录创建失败");
            System.out.println( f2.mkdirs()?"目录创建成功":"目录创建失败");
        }

        System.out.println("---------------------------------------------");
//        5、打印目录中的所有内容
        File f3 = new File("d:/测试/测试1/测试2");
        for (File file : f3.listFiles()) {
            String fileName = file.getName();
            //判断是否是文件
            if (file.isFile()) {
                System.out.println(fileName);
            }

            if (file.isDirectory()) {
                System.out.println("[ " + fileName+" ]");
            }

        }
        System.out.println("---------------------------------------------");
//        6、实现目录中所有内容获取时进行过滤
//        匿名内部类：接口/父类类型 引用变量名 = new 接口/父类类型（）  {方法的重写}
        FileFilter fileFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
//                return false;//false表示全都过滤
                return pathname.getName().endsWith(".txt");     //后缀是.txt结尾的返回true，否则false。true是返回，false是丢弃
            }
        };




        File[] files = f3.listFiles(fileFilter);
        for (File fil : files
        ) {
            System.out.println(fil);
        }

        //lambda表达式方式
//        FileFilter fileFilter1 = (File pathname) -> {
//            return pathname.getName().endsWith(".txt");
//        };
    }
}
