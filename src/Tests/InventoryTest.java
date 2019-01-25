package Tests;

import Kata.Inventory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Anthony on 25/01/2019.
 */
class InventoryTest {
    @Test
    void getInventoryWithoutContents() {
        Inventory inv = new Inventory();
        assertNotEquals(null,inv.getInventory());
    }

    @Test
    void getInventoryWithContents() {
        Inventory inv = new Inventory();
        inv.addItem("a",2);
        assertEquals(1,inv.getInventory().size());
    }

    @Test
    void setInventory() {
        Inventory test = new Inventory();
        test.addItem("b",4);
        Inventory inv = test;
        assertEquals(inv,test);
    }

    @Test
    void addItem() {
    }

}