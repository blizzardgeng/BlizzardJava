package static关键字和继承.final关键字;

/**
 * @author blizzard
 */
public class FinalMemberTest {
    public final int cnt;

    public static String name;




//显示初始化
    //public final int cnt = 6;
//构造快初始化
//    {
//        this.cnt = 7;
//    }
//构造方法初始化
        public FinalMemberTest(int cnt) {
        this.cnt = cnt;
    }

    public static void main(String[] args) {
        //声明FinalMemberTest类型应用指向该类对象
        FinalMemberTest fmt = new FinalMemberTest(8);

        //打印成员变量
        System.out.println("fmt.cnt = "+fmt.cnt);

        FinalMemberTest.name = "123";



    }

}
