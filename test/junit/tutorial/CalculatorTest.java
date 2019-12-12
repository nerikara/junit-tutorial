package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class CalculatorTest extends Calculator {

    @Test
    void multiplyで乗算結果が取得できる() {
        Calculator calculator = new Calculator();
        int expected = 12;
        int actual = calculator.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    void divideで3と2の除算結果が取得できる() {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));
    }
}
