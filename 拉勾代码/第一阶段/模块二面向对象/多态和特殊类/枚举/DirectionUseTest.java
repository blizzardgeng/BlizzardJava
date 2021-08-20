package 多态和特殊类.枚举;

public class DirectionUseTest {

    //        根据传入的参数打印字段
    private static void test1(String str) {
        switch (str) {
            case "向上":
                System.out.println("床前明月光");break;
            case "向下":
                System.out.println("疑是地上霜");break;

            case "向左":
                System.out.println("举头望明月");break;
            case "向右":
                System.out.println("低头思故乡");break;
            default:
                System.out.println(str);
                System.out.println("没找到方法");
        }

    }

    //根据参数制定的enum类型打印具体的信息
    private static void test2(DirectionEnum str) {

        switch (str) {
            case UP:
                System.out.println("床前明月光");break;
            case DOWN:
                System.out.println("疑是地上霜");break;

            case LEFT:
                System.out.println("举头望明月");break;
            case RIGHT:
                System.out.println("低头思故乡");break;
            default:
                System.out.println("没找到方法");
        }

    }

    public static void main(String[] args) {




//        DirectionUseTest.test1(Direction.UP.getDsc());
        DirectionUseTest.test1("向上");
        System.out.println("----------");
        DirectionUseTest.test2(DirectionEnum.DOWN);
        System.out.println("-------");

        DirectionEnum[] objList = DirectionEnum.values();
        System.out.println(objList.length);
        for (DirectionEnum directionEnum : objList) {
            directionEnum.toString();

        }


    }
}
