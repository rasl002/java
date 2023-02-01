package lab_7;

//Создайте в draw.io UML диаграмму и напишите по ней реализацию.
//        Диаграмма должна включать в себя следующие элементы: интерфейс Movable,
//        содержащий в себе методы для движения прямоугольника (вверх, вниз, влево,
//        вправо) и класс MovableRectangle (движущийся прямоугольник), реализующий
//        интерфейс Movable.
public class Main {
    public static void main(String[] args) {
        MovableRectangle rec = new MovableRectangle(2, 5, 8, 2, 1);
        rec.moveUp();
        rec.moveLeft();
        System.out.println(rec.toString());
    }
}
