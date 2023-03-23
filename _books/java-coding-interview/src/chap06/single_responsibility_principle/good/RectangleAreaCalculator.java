package chap06.single_responsibility_principle.good;

public class RectangleAreaCalculator {
    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }
}
