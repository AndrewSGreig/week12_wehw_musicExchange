import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    DrumSticks drumSticks;
    Guitar leadGuitar;
    Guitar bassGuitar;
    GuitarStrings guitarStrings;
    Piano piano;
    ArrayList<String> stock;

    @Before
    public void before() {
        drumSticks = new DrumSticks(5, 6);
        ArrayList<String> stock = new ArrayList<String>();
        shop = new Shop(stock);
    }

    @Test
    public void testAddDrumsticksToStock(){
        shop.addToStock("Drumsticks", 1);
        assertEquals("[Drumsticks]", shop.getStock().toString());

    }
}
