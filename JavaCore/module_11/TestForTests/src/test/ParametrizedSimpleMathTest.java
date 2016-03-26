package test;

import Utils.SimpleMath;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import java.util.Arrays;

@RunWith(value = Parameterized.class)

public class ParametrizedSimpleMathTest {

    private int numberA;
    private int numberB;
    private int expected;

    public ParametrizedSimpleMathTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    // Declares parameters here
    @Parameterized.Parameters(name = "(index) : multiply({0} * {1}) = {2}")

    // If parameter is "[3, 4, 7]", then (index) - test run # (from 0), [0] = 3, [1] = 4, [2] = 7
    public static Iterable<Object[]> getParametrizedData() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {2, 2, 4},
                {8, 2, 16},
                {4, 5, 20}
        });
    }

    @Test
    public void testMult(){
        Assert.assertEquals(expected, new SimpleMath().mult(numberA, numberB));
    }


}



