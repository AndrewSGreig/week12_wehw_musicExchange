import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano grand;
    Piano upright;

    @Before
    public void before(){
        grand = new Piano("Grand", "Arranger", 2000.00, 2500.00);
        upright = new Piano("Upright", "Hammer Action", 1500.00, 1750.00);
    }

    @Test
    public void testCanGetPianoType(){
        assertEquals("Grand", grand.getPianoType());
    }

    @Test
    public void testCanGetKeyType(){
        assertEquals("Arranger", grand.getKeyboardType());
        assertEquals("Hammer Action", upright.getKeyboardType());
    }

    @Test
    public void testCanGetInstrumentType(){
        assertEquals("keyboard", grand.getType());
    }

    @Test
    public void testCanGetPianoColour(){
        assertEquals("brown", grand.getColour());
    }

    @Test
    public void testGuitarColourCanBeChanged(){
        upright.setColour("black");
        assertEquals("black", upright.getColour());
    }

    @Test
    public void testGuitarIsAWoodenInstrument(){
        assertEquals("wood", grand.getMaterial());
    }


    @Test
    public void testCanPlayPiano(){
        assertEquals("PIANO!", grand.play());
    }

    @Test
    public void testCalculateMarkup(){
        assertEquals(500.00, grand.calculateMarkup(), 0.01);
        assertEquals(250.00, upright.calculateMarkup(), 0.01);
    }
}
