package io.lcalmsky.effectivejava.chapter01.item10;

import java.util.Objects;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // 대칭성 위배
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof ColorPoint colorPoint)) {
//            return false;
//        }
//        return super.equals(o) && colorPoint.color == color;
//    }

    // 추이성 위배
//    @Override
//    public boolean equals(Object o) {
//        if (!(o instanceof Point)) {
//            return false;
//        }
//        if (!(o instanceof ColorPoint colorPoint)) {
//            return o.equals(this);
//        }
//        return super.equals(o) && colorPoint.color == color;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ColorPoint that = (ColorPoint) o;
        return color == that.color;
    }

    public static void main(String[] args) {
        // 대칭성 테스트
//        Point point = new Point(1, 2);
//        ColorPoint colorPoint = new ColorPoint(1, 2, Color.RED);
//        System.out.println(point.equals(colorPoint));
//        System.out.println(colorPoint.equals(point));

        // 추이성 테스트
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p1));
    }
}
