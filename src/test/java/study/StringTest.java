package study;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {

    @Test
    void 괄호안_두_숫자_추출() {
        String input = "(10,10)-(14,15)";

        final List<String> collect = Arrays.stream(input.replaceAll("\\(", "").replaceAll("\\)", "")
                .split("-")).collect(Collectors.toList());

        assertThat(collect.get(0)).isEqualTo("10,10");
    }
}
