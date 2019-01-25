package Kata.Checkout;

import java.util.List;

/**
 * Created by Anthony on 25/01/2019.
 */
public interface ICheckout {

    void addToList(ItemInStore item);

    void removeFromList();

    List<ItemInStore> getList();
}
