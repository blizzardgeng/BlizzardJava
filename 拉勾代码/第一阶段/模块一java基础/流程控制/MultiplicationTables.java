package 流程控制;

/**
 * @author blizzard
 */
public class MultiplicationTables {
    public static void main(String[] args) {

        outer:for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((j+"*"+i+"="+i*j));
                System.out.print(" ");
                if (j == 6) {
                    break outer;
                }
            }

            System.out.println();
        };
    }
}
