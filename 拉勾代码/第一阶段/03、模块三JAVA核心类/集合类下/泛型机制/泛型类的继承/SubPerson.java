package 集合类下.泛型机制.泛型类的继承;

//public class SubPerson extends Person{      //不保留泛型，并且没有指定类型，此时，Person类中的T默认是Object类型     擦除

//public class SubPerson extends Person<String> {     //不保留泛型，但是指定了泛型的类型，此时Person类中的T指定为String类型

//public class SubPerson<T> extends Person<T>{        //保留父类的泛型，可以在构造对象时来指定T的泛型

public class SubPerson<T, T1> extends Person<T>{        //保留父类的泛型，同时在子类中增加新的泛型



}
