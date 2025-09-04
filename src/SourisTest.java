import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SourisTest {
    @Test
    public void testGetAge() {
        Souris souris1 = new Souris(50, "blanche", 2);
        Souris souris2 = new Souris(souris1);
        assertEquals(2, souris1.getAge());
        assertFalse(souris1.isClonee());
        assertTrue(souris2.isClonee());
        assertEquals(2, souris2.getAge());
    }
}
