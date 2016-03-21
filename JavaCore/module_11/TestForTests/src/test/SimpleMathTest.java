package test;

import Utils.SimpleMath;
import org.junit.Assert;
import org.junit.Test;

public class SimpleMathTest {

    @Test
    public void testAdd() throws Exception {
        int a = 4;
        int b = 7;

        final SimpleMath simpleMath = new SimpleMath();

        final int result = simpleMath.add(a, b);

        Assert.assertEquals(11, result);
    }
}