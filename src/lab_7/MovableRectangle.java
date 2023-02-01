package lab_7;

public class MovableRectangle implements Movable {
    int ax;
    int ay;
    int bx;
    int by;
    int cx;
    int cy;
    int dx;
    int dy;
    int speed;

    MovableRectangle(int ax, int ay, int bx, int by, int speed) {
       this.ax = ax;
       this.ay = ay;

       this.bx = bx;
       this.by = by;

       this.cx = bx;
       this.cy = ay;

       this.dx = ax;
       this.dy = by;

       this.speed = speed;
    }

    @Override
    public void moveUp() {
        this.ay = this.ay + this.speed;
        this.by = this.by + this.speed;
        this.cy = this.cy + this.speed;
        this.dy = this.dy + this.speed;
    }

    @Override
    public void moveDown() {
        this.ay = this.ay - this.speed;
        this.by = this.by - this.speed;
        this.cy = this.cy - this.speed;
        this.dy = this.dy - this.speed;
    }

    @Override
    public void moveLeft() {
        this.ax = this.ax - this.speed;
        this.bx = this.bx - this.speed;
        this.cx = this.cx - this.speed;
        this.dx = this.dx - this.speed;
    }

    @Override
    public void moveRight() {
        this.ax = this.ax + this.speed;
        this.bx = this.bx + this.speed;
        this.cx = this.cx + this.speed;
        this.dx = this.dx + this.speed;
    }

    @Override
    public String toString() {
        return "Прямоугольник с координатами: " + "ax=" + + this.ax + ",ay=" + this.ay + ", " + "bx=" + + this.bx + ",by=" + this.by + ", " + "cx=" + + this.cx + ",cy=" + this.cy + ", " + "dx=" + + this.dx + ",dy=" + this.dy + " ";
    }
}
