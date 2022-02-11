import enums.Location;
import org.junit.Before;
import org.junit.Test;
import products.Crisp;
import products.Drink;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    Crisp crisp;
    Drink drink;
    Drawer drawer;
    Drawer drawer2;

    @Before
    public void before() {
        crisp = new Crisp("Squares", "Walkers", 1.00);
        drink = new Drink("Coca Cola", "The Coca Cola Company", 1.20);
        drawer = new Drawer(Location.A1, 3);
        drawer2 = new Drawer(Location.A2, 4);
    }

    @Test
    public void hasCrispPacket() {
        drawer.addProduct(crisp);
        assertEquals(1, drawer.addProduct().size());
    }
}
