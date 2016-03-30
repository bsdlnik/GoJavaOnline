import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoinCharactersTest {

    private static JoinCharacters joinCharacters;

    @Before
    public void setUp() throws Exception {
        joinCharacters = new JoinCharacters();
        System.out.println("SetUp method Called");
    }

    @Test
    public void testJoin() throws Exception {
        char[] number = new char[]{'1', '2', '3'};
        int result = joinCharacters.join(number);
        assertEquals(123, result);

        number = new char[]{'0', '2', '3'};
        result = joinCharacters.join(number);
        assertEquals(23, result);

    }
}