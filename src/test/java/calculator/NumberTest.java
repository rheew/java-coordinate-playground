package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NumberTest {

    @Test
    void 숫자는_24이하여야_한다() {

        final Number number1 = new Number(1);
        final Number number2 = new Number(24);

        assertThat(number1.getNumber()).isEqualTo(1);
        assertThat(number2.getNumber()).isEqualTo(24);
    }

    @Test
    void 숫자24_넘어가면_예외_발생() {

        assertThatThrownBy(() -> {
            new Number(25);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
