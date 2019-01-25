package Tests;

import Kata.Inventory;
import org.junit.jupiter.api.Test;

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
        inv.addItem();
        assertNotEquals(null,inv.getInventory());
    }

    @Test
    void setInventory() {
    }

    @Test
    void addItem() {
    }

}