package 第一阶段.模块二面向对象.特殊类.枚举.枚举Switch;

/**
 * 描述
 *
 * @author Kevin
 * @date 2021/08/18 15:10:28
 */
public class PersonTest {

    private static void test1(String dec) {

        switch (dec) {
            case "向上":
                System.out.println("窗前明月光");
                break;
            case "向下":
                System.out.println("疑是地上霜");
                break;
            case "向左":
                System.out.println("举头望明月");
                break;
            case "向右":
                System.out.println("低头思故乡");
                break;
            default:
                System.out.println("不匹配");
        }


    }

    private static void test2(Person dec) {

        switch (dec) {
            case UP:
                System.out.println("窗前明月光");
                break;
            case DOWN:
                System.out.println("疑是地上霜");
                break;
            case LEFT:
                System.out.println("举头望明月");
                break;
            case RIGHT:
                System.out.println("低头思故乡");
                break;
            default:
                System.out.println("不匹配");
        }


    }


    public static void main(String[] args) {

        Person p1 = Person.UP;
        Person p2 = Person.LEFT;
        test1(p2.getDsc());
        System.out.println("--------------");
        test2(Person.DOWN);

    }
}
