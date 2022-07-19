package calculator;

public class PointCalculator {

    public double twoPointDistance(Points points) {

        final Point pointSubtract = points.getPointSubtract();

        pointSubtract.squared();

        return pointSubtract.getSumAndSqrt();
    }

    public int squareArea(Points points) {

        return points.getHeight() * points.getWidth();
    }
}
