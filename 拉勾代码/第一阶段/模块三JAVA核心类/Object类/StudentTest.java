package 第一阶段.模块三JAVA核心类.Object类;

/**
 * equals默认比较方法，默认比较地址
 */
public class StudentTest {
    public static void main(String[] args) {
//        重写equals调用
//        1、使用有参构造Student类型的2个对象并判断是否相等
        Student s1 = new Student(10, "张飞");
        Student s2 = new Student(10, "关羽");
//        2、调用冲Object类中继承的equals方法，笔记两个对象的地址
        boolean b1 = s1.equals(s2);
        System.out.println(b1);
        System.out.println(s1 == s2);
        System.out.println("-----------------------");

//      重写hashCode调用
//      下面调用 oblect类中继承下来的 hashCode方法,获取调用对象的哈秀码值(内存地址的编号)
        int ia = s1.hashCode();
        int ib = s2.hashCode();
        System.out.println("ia==" + ia + ",ib==" + ib);
        System.out.println("--------------------------");

//        重写toString调用
//        下面调用object类中继承下来的toString方法,获取调用对象的字符形式:包名.类名@哈希码值的十六进制
        String str1 = s1.toString();
        System.out.println("str1="+str1);
        System.out.println(s1); //当打印引用变量的时候，会自动调用toString方法







    }


}
