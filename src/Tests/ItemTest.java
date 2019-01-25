package Tests;

import Kata.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Anthony on 25/01/2019.
 */
class ItemTest {

    @Test
    void getSKU() {
        Item item = new Item("A",1);
        assertEquals("A",item.getSKU());
    }

    @Test
    void setSKU() {
    }

    @Test
    void getPrice() {
        Item item = new Item("A",1);
        assertEquals(1,item.getPrice());
    }

    @Test
    void setPrice() {
    }
}