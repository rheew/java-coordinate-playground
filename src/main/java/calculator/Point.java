package calculator;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
public class Point {

    private Number x;
    private Number y;

    public Point(String input) {
        final List<Integer> collect = Arrays.stream(input.split(","))
                .map(i -> Integer.parseInt(i))
                .collect(Collectors.toList());

        this.x = new Number(collect.get(0));
        this.y = new Number(collect.get(1));
    }

    public Point subtractPoint(Point point) {
        double x = this.x.getNumber() - point.getX().getNumber();
        double y = this.y.getNumber() - point.getY().getNumber();

        return new Point(new Number(x), new Number(y));
    }

    public void squared() {
        this.x.pow(2);
        this.y.pow(2);
    }

    public double getSumAndSqrt() {
        return Math.sqrt(x.getNumber() + y.getNumber());
    }

    public Point checkSameLine(Point point) {
        if (x.equals(point.getX())) {
            return point;
        }
        if (y.equals(point.getY())) {
            return point;
        }

        throw new IllegalArgumentException("직사각형이 아닙니다.");
    }
}
