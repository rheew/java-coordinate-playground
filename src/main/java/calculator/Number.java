package calculator;

import lombok.Getter;

@Getter
public class Number {

    private double number;

    public Number(double i) {
        validation(i);
        this.number = i;
    }

    private void validation(double i) {
        if (isOverInput(i)) {
            throw new IllegalArgumentException("입력 범위를 초과 했습니다.");
        }
    }

    private boolean isOverInput(double i) {
        return i > 24;
    }

    public void pow(int i) {
        number = Math.pow(number, i);
    }

    public void sqrt() {
        number = Math.sqrt(number);
    }
}
