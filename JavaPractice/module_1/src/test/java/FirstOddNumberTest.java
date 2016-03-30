import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstOddNumberTest {

    private static FirstOddNumber firstOddNumber;

    @Before
    public void setUp() throws Exception {
        firstOddNumber = new FirstOddNumber();
        System.out.println("SetUp method Called");
    }

    @Test
    public void testFind() throws Exception {
        int[] number = {1, 2, 3};
        int result = firstOddNumber.find(number);
        assertEquals(0, result);

        number = new int[]{2, 2, 2};
        result = firstOddNumber.find(number);
        assertEquals(-1, result);

        number = new int[]{2, 2, 7};
        result = firstOddNumber.find(number);
        assertEquals(2, result);
    }
}