package Tests;

import Kata.Inventory.Item;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Anthony on 25/01/2019.
 */
class ItemTest {

    @Test
    @DisplayName("Get the SKU name")
    void getSKU() {
        Item item = new Item("A",1);
        assertEquals("A",item.getSKU());
    }

    @Test
    @DisplayName("Set the SKU name")
    void setSKU() {
        Item item = new Item("A",1);
        item.setSKU("H");
        assertEquals("H",item.getSKU());
    }

    @Test
    @DisplayName("Get the Unit price")
    void getPrice() {
        Item item = new Item("A",1);
        assertEquals(1,item.getPrice());
    }

    @Test
    @DisplayName("Set unit price")
    void setPrice() {
        Item item = new Item("A",1);
        item.setPrice(5);
        assertEquals(5,item.getPrice());
    }

    @Test
    @DisplayName("SKU can only be alphabetical")
    void testSKUisAlphabetical(){
        Item item = new Item("#",1);
        assertEquals(null,item.getSKU());
    }


    @Test
    @DisplayName("SKU can only be alphabetical uppercase")
    void testSKUisAlphabeticalUpperCase(){
        Item item = new Item("a",1);
        assertEquals("A",item.getSKU());
    }

    @Test
    @DisplayName("Each item must have a price")
    void mustHavePrice(){
        Item item = new Item("a",0);
        assertEquals(1,item.getPrice());
    }

}