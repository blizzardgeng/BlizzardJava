package 集合类下.泛型机制.自定义泛型类;

public class PersonTest {
    public static void main(String[] args) {

//        1、声明Person类型对象指向Person类型的引用
        Person p1 = new Person("张飞", 30, "男");

//        2、打印特征
        System.out.println(p1);

        System.out.println("-----------------------------------");
//        3、在创建对象时候指定数据类型，给T进行初始化
        Person<String> p2 = new Person<>();
        p2.setGender("女");
        System.out.println(p2);

//        4、使用boolean类型作为性别的类型
        Person<Boolean> p3 = new Person<>();
        p3.setGender(true);
        System.out.println(p3);

        //        5、泛型方法进行测试
        Integer[] arr = {11, 22, 33, 44, 55};
        Person.printArray(arr);

    }
}
