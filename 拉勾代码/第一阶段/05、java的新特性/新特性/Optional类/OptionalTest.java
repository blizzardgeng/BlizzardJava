package 新特性.Optional类;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest {
    public static void main(String[] args) {

//        String str1 = "hello";
        String str1 = null;

        System.out.println(null!= str1?"字符长度是"+str1.length():"该字符串是空，长度为0");
        System.out.println("--------------------------------------");
//        java8开始可以使用Optional类

        //1将str装到Optional对象代表的容器中
        Optional<String> optionalS = Optional.ofNullable(str1);
//        2、建立映射，使用字符串的长度和字符串建立映射关系
        Optional<Integer> integer = optionalS.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });

//        3、若字符串为空，打印0，否则打印字符串中的数值
        System.out.println(integer.orElse(0));


    }
}
