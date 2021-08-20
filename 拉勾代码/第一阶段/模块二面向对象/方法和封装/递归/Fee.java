package 第一阶段.模块二面向对象.方法和封装.递归;

/**
 * @author : Kevin Geng
 * @date : 2021/5/31 10:10 下午
 */
public class Fee {
//    自定义成员方法实现费氏数列中第n项数值的计算并返回,n由参数指定
//    1,1,2,3,5,8,13....

    int show(int n) {
//        递归方式
//        if (1 == n || 2 == n) {
//            return 1;
//        } else {
//            return show(n - 1) + show(n - 2);
//        }

//        使用递推的方式
        int ia = 1;
        int ib = 1;
        for (int i = 3; i <= n; i++) {
            int ic = ia + ib;
            ia = ib;
            ib = ic;

        }
        return ib;

    }
}