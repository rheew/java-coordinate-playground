package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class PointCalculatorTest {

    @Test
    void 두점_거리계산() {
        final String input = "(10,10)-(14,15)";
        final Points points = new Points(input);

        final PointCalculator calculator = new PointCalculator();

        double distance = calculator.twoPointDistance(points);

        assertThat(distance).isEqualTo(6.403, offset(0.0099));
    }
}
