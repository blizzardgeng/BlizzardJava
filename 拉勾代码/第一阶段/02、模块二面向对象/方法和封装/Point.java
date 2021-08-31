package 方法和封装;

public class Point {
    int x;
    int y;

    Point() {

    }

    Point(int i,int j) {
        x = i;
        y = j;

    }




    void show() {
        System.out.println("横坐标是"+x+",竖坐标是"+y);
    }


    //自定义成员方法实现纵坐标-1的方法
    void up() {
        y--;
    }

    //自定义成员方法实现纵坐标减去指定值
    void up(int dy) {

        y -= dy;
    }

    public static void main(String[] args) {
        Point s1 = new Point();
        s1.show();

        Point s2 = new Point(5, 7);
        s2.show();
        System.out.println("-----------");
        s2.up();
        s2.show();
        s2.up(3);
        s2.show();
    }

}
