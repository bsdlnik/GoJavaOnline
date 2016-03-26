package test;

import Utils.SimpleMath;
import org.junit.*;

import static org.junit.Assert.*;

public class SimpleMathTest {

    private static SimpleMath simpleMath;

  /*  @Before
    public void setUp() throws Exception {
        simpleMath = new SimpleMath();
        System.out.println("SetUp method Called");
    }*/

    @BeforeClass
    public static void setUpClass() throws Exception {
        simpleMath = new SimpleMath();
        System.out.println("SetUp method Called");
    }

    @Test(timeout = 3000)
    public void testAdd() throws Exception {
        int a = 4;
        int b = 7;

        final int result = simpleMath.add(a, b);

        assertEquals(11, result);
    }

    //@Ignore
    @Test(timeout = 3000)
    public void testSub() throws Exception {
        final int a = 42;
        final int b = 15;

        final int result = simpleMath.sub(a, b);

        assertEquals(a - b, result);
    }

  /*  @After
    public void tearDown() throws Exception {
        System.out.println("tearDown Called");

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("tearDownClass");

    }*/

    @Test(timeout = 3000)
    public void testModulo() throws Exception {
        final int a = 17;
        final int b = 3;

        final int result = simpleMath.modulo(17, 3);

        assertEquals(a % b, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDiv() throws Exception {
        final int a = 17;
        final int b = 3;

        simpleMath.div(17, 3);

    }
}