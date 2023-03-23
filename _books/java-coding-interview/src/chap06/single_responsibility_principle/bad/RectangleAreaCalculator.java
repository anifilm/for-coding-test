package chap06.single_responsibility_principle.bad;

public class RectangleAreaCalculator {
    private static final double INCH_TERM = 0.0254d;

    private final int width;
    private final int height;

    public RectangleAreaCalculator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    // 이 메서드는 단일 책임 원칙에 맞지 않습니다.
    public double metersToInches(int area) {
        return area / INCH_TERM;
    }
}
