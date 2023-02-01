package lab_6;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.y = this.y + this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = this.y - this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = this.x - this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = this.x + this.xSpeed;
    }

    @Override
    public String toString() {
        return "Точка с координатами: x=" + this.x + ",y=" + this.y;
    }
}
