import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StringManipulatorEemeliTest {

    private StringManipulatorEemeli manipulator;

    @Before
    public void setUp() {
        manipulator = new StringManipulatorEemeli();
    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Setting up the test class");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Tearing down the test class");
    }

    @Test
    public void testReverse() {
        assertEquals("!dlroW ,olleH", manipulator.reverse("Hello, World!"));
    }

    @Test
    public void testCapitalize() {
        assertEquals("HELLO, WORLD!", manipulator.capitalize("hello, world!"));
    }
}
