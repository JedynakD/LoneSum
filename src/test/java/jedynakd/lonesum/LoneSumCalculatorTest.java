package jedynakd.lonesum;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoneSumCalculatorTest {

    private LoneSumCalculator loneSumCalculator = new LoneSumCalculator();

    @Test
    public void shouldReturnTrueWhenValueWasAdded() {
        boolean result = loneSumCalculator.addValue(1);

        assertEquals(true, result);
    }

    @Test
    public void shouldReturnFalseWhenValueWasNotAddedBecauseListSizeIsMoreThanThree() {
        loneSumCalculator.addValue(1);
        loneSumCalculator.addValue(2);
        loneSumCalculator.addValue(3);
        boolean result = loneSumCalculator.addValue(4);

        assertEquals(false, result);
    }

    @Test
    public void shouldReturnZeroWhenSummingUpValuesAndListSizeIsNotThree() {
        int result = loneSumCalculator.sumUp();

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnZeroWhenAllThreeValuesAreEqual() {
        loneSumCalculator.addValue(3);
        loneSumCalculator.addValue(3);
        loneSumCalculator.addValue(3);

        int result = loneSumCalculator.sumUp();

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnSumWhenValuesAreSummedUp() {
        loneSumCalculator.addValue(3);
        loneSumCalculator.addValue(2);
        loneSumCalculator.addValue(1);

        int result = loneSumCalculator.sumUp();

        assertEquals(6, result);
    }

    @Test
    public void shouldReturnOneValueWhenTwoOtherValuesAreEqual() {
        loneSumCalculator.addValue(3);
        loneSumCalculator.addValue(2);
        loneSumCalculator.addValue(2);

        int result = loneSumCalculator.sumUp();

        assertEquals(3, result);
    }

}
