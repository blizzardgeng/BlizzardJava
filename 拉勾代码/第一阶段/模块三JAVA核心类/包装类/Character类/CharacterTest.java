package 第一阶段.模块三JAVA核心类.包装类.Character类;

public class CharacterTest {
    public static void main(String[] args) {
//        1、在java5之前调用方法实现装箱和拆箱机制
//       装箱  相当于从char类型到Character类型到转换
        Character ca1 = Character.valueOf('a');
        System.out.println("ca1 = "+ca1);
//      拆箱  从Character类型到char类型转换
        char c1 = ca1.charValue();
        System.out.println("c1 = "+ c1);

        System.out.println("-----------------------------------");
//        2、从java5开始可以自动装箱和拆箱;
        Character ca2 = 'b';
        char c2 = ca2;
        System.out.println("ca2 = "+ca2);

//        3、实现字符类型到转换和判断
        System.out.println(Character.isUpperCase(c2));  //false   判断是否为大写字母
        System.out.println(Character.isLowerCase(c2));  //true   判断是否为小写字母
        System.out.println(Character.isDigit(c2));  //false   判断是否为数字

        System.out.println("转换成大写字符是" + Character.toUpperCase(c2));   //将字符转换成大写的，B
        System.out.println("转换成小写字符是" + Character.toLowerCase(c2));   //将字符转换成小写的，b


    }
}
