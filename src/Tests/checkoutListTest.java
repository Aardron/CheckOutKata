package Tests;

import Kata.Checkout.ItemInStore;
import Kata.Checkout.checkoutList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by Anthony on 25/01/2019.
 */
class checkoutListTest {

    @Test
    void addToList() {
        checkoutList checkout = new checkoutList();
        ItemInStore item = new ItemInStore("J");
        checkout.addToList(item);
        assertEquals("J",checkout.getList().get(0).getSKU());

    }

    @Test
    void removeFromList() {
    }

}