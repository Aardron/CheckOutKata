package Kata;

import java.util.List;

/**
 * Created by Anthony on 25/01/2019.
 */
public interface Iinventory {

     void addItem();

     List<Item> getInventory();

     void setInventory(List inventory);
}
