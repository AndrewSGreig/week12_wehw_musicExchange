import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("Guitar strings",5.00, 6.99);
    }

    @Test
    public void testCalculateMarkup(){
        assertEquals(1.99, guitarStrings.calculateMarkup(), 0.01);
    }


}
