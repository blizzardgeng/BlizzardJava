package 第一阶段.模块一java基础.流程控制;

/**
 * @author blizzard
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
