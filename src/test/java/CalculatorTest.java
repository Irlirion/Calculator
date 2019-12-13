import junit.framework.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testSum() {
        // Given
        Calculator calculator = new Calculator();
        // When
        int result = calculator.sum(10, 2);
        // Then
        if (result != 12) {
            Assert.fail();
        }
        // When
        result = calculator.sum(0, 0);
        // Then
        if (result != 0) {
            Assert.fail();
        }
        // When
        result = calculator.sum(10 * 10, 2);
        // Then
        if (result != 10 * 10 + 2) {
            Assert.fail();
        }
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0, calculator.minus(2, 2));
        Assert.assertEquals(-2, calculator.minus(0, 2));
        Assert.assertEquals(2, calculator.minus(4, 2));
        Assert.assertEquals(10 * 1000, calculator.minus(10 * 1000 + 2, 2));
        Assert.assertEquals(0, calculator.minus(0, 0));


    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.divide(6, 3));
        Assert.assertEquals(0, calculator.divide(0, 3));
        Assert.assertEquals(-2, calculator.divide(-6, 3));
        Assert.assertEquals(-2, calculator.divide(6, -3));
        Assert.assertEquals(1, calculator.divide(6, 6));

    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(18, calculator.multiply(6, 3));
        Assert.assertEquals(0, calculator.multiply(0, 0));
        Assert.assertEquals(0, calculator.multiply(6, 0));
        Assert.assertEquals(-1, calculator.multiply(1, -1));
        Assert.assertEquals(10 * 10, calculator.multiply(10, 10));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
}