import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar leadGuitar;
    Guitar bass;

    @Before
    public void before(){
        leadGuitar = new Guitar("Acoustic", 6, 50.00, 60.00);
        bass = new Guitar("Bass", 5, 40.00, 55.00);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(10.00, leadGuitar.calculateMarkup(),0.01);
        assertEquals(15.00, bass.calculateMarkup(), 0.01);
    }

    @Test
    public void testGuitarIsAStringedInstrument(){
        assertEquals("String", leadGuitar.getType());
    }

    @Test
    public void testCanGetGuitarColour(){
        assertEquals("brown", leadGuitar.getColour());
    }

    @Test
    public void testGuitarColourCanBeChanged(){
        leadGuitar.setColour("white");
        assertEquals("white", leadGuitar.getColour());
    }

    @Test
    public void testGuitarIsAWoodenInstrument(){
        assertEquals("wood", leadGuitar.getMaterial());
    }

    @Test
    public void testGuitarHasGuitarType(){
        assertEquals("Acoustic", leadGuitar.getGuitarType());
    }

    @Test
    public void testGuitarCanChangeType(){
        leadGuitar.setGuitarType("Electro Acoustic");
        assertEquals("Electro Acoustic", leadGuitar.getGuitarType());
    }

    @Test
    public void testGuitarsHaveStrings(){
        assertEquals(6, leadGuitar.getStrings());
        assertEquals(5, bass.getStrings());
    }

    @Test
    public void testGuitarCanBePlayed(){
        assertEquals("GUITAR!", leadGuitar.play());
    }

}
