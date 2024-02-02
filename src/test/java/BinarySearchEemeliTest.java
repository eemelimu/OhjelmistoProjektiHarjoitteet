import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinarySearchEemeliTest {
    @Test
    public void testSearch() {
        int[] array = {1, 3, 5};
        assertEquals(-1, BinarySearchEemeli.search(0, array));
        assertEquals(0, BinarySearchEemeli.search(1, array));
        assertEquals(1, BinarySearchEemeli.search(3, array));
    }
}
