package 流程控制;

/**
 * @author blizzard
 */
public class ForForPrimerTest {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (0 == i % j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
    }

}
