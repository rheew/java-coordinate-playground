package calculator;

import lombok.Getter;

@Getter
public class Number {

    private int number;

    public Number(int i) {
        validation(i);
        this.number = i;
    }

    private void validation(int i) {
        if (isOverInput(i)) {
            throw new IllegalArgumentException("입력 범위를 초과 했습니다.");
        }
    }

    private boolean isOverInput(int i) {
        return i > 24 || i < 0;
    }

}
