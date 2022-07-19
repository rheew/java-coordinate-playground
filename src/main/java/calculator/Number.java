package calculator;

import lombok.Getter;

import java.util.Objects;

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

    public int subtractToInt(Number number) {
        return (int) (this.number - number.getNumber());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number1 = (Number) o;
        return Double.compare(number1.number, number) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
