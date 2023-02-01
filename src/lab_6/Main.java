package lab_6;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        MovableCircle circle = new MovableCircle(0, 0, 2, 2, 3);
        point.moveRight();
        point.moveRight();
        point.moveDown();
        System.out.println(point.toString());
        circle.moveLeft();
        circle.moveLeft();
        circle.moveUp();
        System.out.println(circle.toString());
    }
}
