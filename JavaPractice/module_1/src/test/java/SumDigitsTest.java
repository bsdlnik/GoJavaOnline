import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumDigitsTest {

    private static SumDigits sumDigits;

    @Before
    public void setUp() throws Exception {
        sumDigits = new SumDigits();
        System.out.println("SetUp method Called");
    }

    @Test(timeout = 1000)
    public void testSum() throws Exception {
        int number = 123;
        int result = sumDigits.sum(number);
        assertEquals(6, result);

        number = -123;
        result = sumDigits.sum(number);
        assertEquals(6, result);

        number = 6;
        result = sumDigits.sum(number);
        assertEquals(6, result);

        number = 1;
        result = sumDigits.sum(number);
        assertEquals(1, result);

        number = 0;
        result = sumDigits.sum(number);
        assertEquals(0, result);

        number = 1111111;
        result = sumDigits.sum(number);
        assertEquals(7, result);

        number = -0;
        result = sumDigits.sum(number);
        assertEquals(0, result);

        number = 1000000;
        result = sumDigits.sum(number);
        assertEquals(1, result);
    }




    @After
    public void tearDown() throws Exception {

    }

}