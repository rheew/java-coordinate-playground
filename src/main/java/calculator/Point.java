package calculator;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class Point {

    private int x;
    private int y;

    public Point(String input) {
        final List<Integer> collect = Arrays.stream(input.split(","))
                .map(i -> Integer.parseInt(i))
                .collect(Collectors.toList());

        this.x = collect.get(0);
        this.y = collect.get(1);
    }
}
