package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointsTest {

    @Test
    void 두점_구분() {

        final String input = "(10,10)-(14,15)";
        final Points points = new Points(input);

        assertThat(points.getPointCount()).isEqualTo(2);
    }

    @Test
    void 네점구분() {
        final String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        final Points points = new Points(input);

        assertThat(points.getPointCount()).isEqualTo(4);
    }

    @Test
    void 직사각형_아니면_예외발생() {
        final String input = "(10,10)-(22,10)-(22,18)-(10,17)";
        final Points points = new Points(input);

        assertThatThrownBy(() -> points.validationSquare())
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 밑변_길이() {
        final String input = "(10,10)-(22,10)-(22,18)-(10,17)";
        final Points points = new Points(input);

        assertThat(points.getWidth()).isEqualTo(12);
    }

    @Test
    void 높이_길이() {
        final String input = "(10,10)-(22,10)-(22,18)-(10,17)";
        final Points points = new Points(input);

        assertThat(points.getHeight()).isEqualTo(8);
    }
}
