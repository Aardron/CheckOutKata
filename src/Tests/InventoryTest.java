package Tests;

import Kata.Inventory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Created by Anthony on 25/01/2019.
 */
class InventoryTest {
    @Test
    void getInventory() {
        Inventory inv = new Inventory();
        assertNotEquals(null,inv.getInventory());
    }

    @Test
    void setInventory() {
    }

    @Test
    void addItem() {
    }

}