package Tests;

import Kata.Checkout.ItemInStore;
import Kata.Checkout.checkoutList;
import org.junit.jupiter.api.Test;

/**
 * Created by Anthony on 25/01/2019.
 */
class checkoutListTest {

    @Test
    void addToList() {
        checkoutList checkout = new checkoutList();
        ItemInStore item = new ItemInStore("J");
        checkout.addToList(item);


    }

    @Test
    void removeFromList() {
    }

}