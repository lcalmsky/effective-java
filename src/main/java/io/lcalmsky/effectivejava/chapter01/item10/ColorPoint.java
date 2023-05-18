package io.lcalmsky.effectivejava.chapter01.item10;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // 대칭성 위배
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint colorPoint)) {
            return false;
        }
        return super.equals(o) && colorPoint.color == color;
    }

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.RED);
        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));
    }
}
