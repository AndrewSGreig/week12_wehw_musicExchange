import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano grand;
    Piano upright;

    @Before
    public void before(){
        grand = new Piano("Grand", "Arranger");
        upright = new Piano("Upright", "Hammer Action");
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
}
