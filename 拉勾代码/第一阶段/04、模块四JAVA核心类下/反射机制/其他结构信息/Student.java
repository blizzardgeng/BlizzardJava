package 反射机制.其他结构信息;

import java.io.Serializable;

@MyAnnotation
public class Student<T,E> extends Person implements Comparable, Serializable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
