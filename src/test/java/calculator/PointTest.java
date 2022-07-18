package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    void 좌표_생성() {

        final Point point = new Point("10,12");

        assertThat(point.getX()).isEqualTo(10);
        assertThat(point.getY()).isEqualTo(12);
    }

    @Test
    void 두_점뺴기() {
        final Point point1 = new Point("10,12");
        final Point point2 = new Point("10,13");

        final Point point = point1.subtractPoint(point2);

        assertThat(point.getX()).isEqualTo(0);
        assertThat(point.getY()).isEqualTo(-1);
    }

    @Test
    void 각각_제곱하기() {
        final Point point = new Point("10,13");

        point.squared();

        assertThat(point.getX().getNumber()).isEqualTo(100);
    }

    @Test
    void 합과제곱근() {
        final Point point = new Point("10,13");

        double sqrtSum = point.getSumAndSqrt();

        assertThat(sqrtSum).isEqualTo(Math.sqrt(23));
    }
}
