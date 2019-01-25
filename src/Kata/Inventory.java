package Kata;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 25/01/2019.
 */
public class Inventory implements  Iinventory{
    private List<Item> inventory;

    public Inventory(){
        inventory = new ArrayList<Item>();
    }

    @Override
    public List<Item> getInventory() {
        return inventory;
    }

    @Override
    public void setInventory(List inventory) {
        this.inventory = inventory;
    }

    @Override
    public void addItem(String SKU, int price) {
        Item newItem = new Item(SKU,price);
        inventory.add(newItem);
    }
}
