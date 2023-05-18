package io.lcalmsky.effectivejava.chapter01.item10;

public class Point {
    protected final int x;
    protected final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("1");
        if (!(o instanceof Point point)) {
            System.out.println("2");
            return false;
        }
        System.out.println("3");
        return point.x == this.x && point.y == this.y;
    }

    // 리스코프 치환법칙 위배
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || o.getClass() != getClass()) {
//            return false;
//        }
//        Point point = (Point) o;
//        return point.x == x && point.y == y;
//    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Point point = (Point) o;
//        return x == point.x && y == point.y;
//    }
}
