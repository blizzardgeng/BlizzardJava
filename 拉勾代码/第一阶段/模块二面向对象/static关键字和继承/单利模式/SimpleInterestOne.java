package static关键字和继承.单利模式;

/**
 * @author Administrator
 * 单利模式--懒汉式
 */
public  class SimpleInterestOne {
    private static SimpleInterestOne s1 = null;

    public static SimpleInterestOne getInstance() {
        if (null == s1) {
            s1 = new SimpleInterestOne();
        }
        return s1;
    }


}
