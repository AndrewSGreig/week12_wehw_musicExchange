import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    DrumSticks drumSticks;
    Guitar leadGuitar;
    GuitarStrings guitarStrings;
    Piano piano;
    ArrayList<String> stock;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Wooden drumsticks", 5, 6);
        leadGuitar = new Guitar("Lead Guitar", 6, 50.00, 60.00);
        guitarStrings = new GuitarStrings("Guitar Strings", 2.00, 5.00);
        piano = new Piano("grand", "Arranger", 2000.00, 2500.00);
        ArrayList<String> stock = new ArrayList<String>();
        shop = new Shop(stock);
        shop.addToStock(drumSticks.getName(), 2);
        shop.addToStock(leadGuitar.getName(),1);
        shop.addToStock(guitarStrings.getName(), 1);

    }

    @Test
    public void testAddToStock(){
        shop.addToStock(piano.getName(), 1);
        assertEquals("[Wooden drumsticks, Wooden drumsticks, guitar, Guitar Strings, piano]", shop.getStock().toString());
    }

    @Test
    public void testRemoveFromStock(){
        System.out.println(shop.getStock().toString());
        shop.removeFromStock(guitarStrings.getName());
        System.out.println(shop.getStock().toString());
    }

}
