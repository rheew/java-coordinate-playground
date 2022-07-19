package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Points {

    private List<Point> points = new ArrayList<>();

    public Points(String input) {
        Arrays.stream(input.replaceAll("\\(", "").replaceAll("\\)", "")
                .split("-"))
        .map(Point::new)
        .forEach(point -> points.add(point));
    }

    public int getPointCount() {
        return points.size();
    }

    public Point getPointSubtract() {
        return points.stream()
                .reduce(Point::subtractPoint)
                .orElse(null);
    }

    public void validationSquare() {
        points.stream()
                .reduce(Point::checkSameLine);
    }

    public int getWidth() {
        final Number maxXValue = points.stream()
                .max((a, b) -> a.getX().subtractToInt(b.getX()))
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 점입니다."))
                .getX();

        final Number minXValue = points.stream()
                .max((a, b) -> b.getX().subtractToInt(a.getX()))
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 점입니다."))
                .getX();

        return maxXValue.subtractToInt(minXValue);
    }

    public int getHeight() {
        final Number maxYValue = points.stream()
                .max((a, b) -> a.getY().subtractToInt(b.getY()))
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 점입니다."))
                .getY();

        final Number minYValue = points.stream()
                .max((a, b) -> b.getY().subtractToInt(a.getY()))
                .orElseThrow(() -> new IllegalArgumentException("유효하지 않은 점입니다."))
                .getY();

        return maxYValue.subtractToInt(minYValue);
    }
}
