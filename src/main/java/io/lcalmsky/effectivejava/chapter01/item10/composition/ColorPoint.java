package io.lcalmsky.effectivejava.chapter01.item10.composition;

import io.lcalmsky.effectivejava.chapter01.item10.Color;
import io.lcalmsky.effectivejava.chapter01.item10.Point;

import java.util.Objects;

public class ColorPoint {
    private final Point point;
    private final Color color;

    public ColorPoint(Point point, Color color) {
        this.point = point;
        this.color = color;
    }

    public Point asPoint() {
        return point;
    }

    public Color asColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorPoint that = (ColorPoint) o;
        return Objects.equals(point, that.point) && color == that.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, color);
    }
}
