package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointsTest {

    @Test
    void 두점_구분() {

        final String input = "(10,10)-(14,15)";
        final Points points = new Points(input);

        assertThat(points.getPointCount()).isEqualTo(2);
    }
}
