package Tests;

import Kata.Inventory.Inventory;
import Kata.Inventory.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        Inventory inv = new Inventory();
        inv.addItem("J", 55);
        assertEquals(55,inv.getInventory().get(0).getPrice());
        assertEquals("J",inv.getInventory().get(0).getSKU());
    }

    @Test
    @DisplayName("No duplicate SKU check")
    void noDuplicatesSKU() {
        Inventory inv = new Inventory();
        inv.addItem("J", 55);
        inv.addItem("i", 2);
        inv.addItem("A", 2);
        inv.addItem("i", 1);

        int length = inv.getInventory().size();
        boolean isSame = false;

        for (int i =0;i<length;i++) {
            Item A =inv.getInventory().get(i);
            for (int j =i+1;j<length;j++) {
                Item B =inv.getInventory().get(j);
                if(A.getSKU().equals(B.getSKU())){
                    isSame = true;
                    break;
                }
            }
        }

        assertFalse(isSame);
    }

    @Test
    void itemNotRemoved(){
        Inventory inv = new Inventory();
        inv.addItem("J", 55);
        inv.removeItem("I");
        assertEquals(1,inv.getInventory().size());
    }

    @Test
    void itemRemoved(){
        Inventory inv = new Inventory();
        inv.addItem("J",55);
        inv.removeItem("J");
        assertEquals(0,inv.getInventory().size());
    }

    @Test
    void itemRemovedFromMultipleItems(){
        Inventory inv = new Inventory();
        inv.addItem("J",55);
        inv.addItem("I",1);
        inv.addItem("A",55);
        inv.removeItem("J");
        assertEquals(2,inv.getInventory().size());
    }

    @Test
    void multipleItemRemoval(){
        Inventory inv = new Inventory();
        inv.addItem("J",55);
        inv.addItem("J",1);
        inv.addItem("A",55);
        inv.removeItem("J");
        assertEquals(1,inv.getInventory().size());
    }
}