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
}
