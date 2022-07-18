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
}
