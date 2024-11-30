public class Main {
    public static void main(String[] args) {
        // Создаем объекты фигур
        Drawable circle = new Circle();
        Drawable rectangle = new Rectangle();
        Drawable triangle = new Triangle();

        // Рисуем фигуры
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}