package LSP;

public class Rectangle {
    /** Класс прямоугольник */
    private int width;// ширина
    private int height;// высота

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int area() {
        return this.width * this.height;
    }

}
