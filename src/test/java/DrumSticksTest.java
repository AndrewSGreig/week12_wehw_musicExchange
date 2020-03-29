import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    DrumSticks drumsticks;

    @Before
    public void before(){
        drumsticks = new DrumSticks(7.00, 12.99);
    }

    @Test
    public void testCalculateMarkup(){
        assertEquals(5.99, drumsticks.calculateMarkup(), 0.01);
    }
}
