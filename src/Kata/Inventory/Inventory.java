package Kata.Inventory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anthony on 25/01/2019.
 */
public class Inventory implements Iinventory {
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
        removeDuplicates();
        removeNullSKU();
    }

    public void removeNullSKU(){
        for(int i =0; i<getInventory().size();i++){
            if( getInventory().get(i).getSKU().equals("")){
                getInventory().remove(i);
            }
        }
    }

    private void removeDuplicates(){

        int length = getInventory().size();

        for (int i =0;i<length;i++) {
            Item A =getInventory().get(i);
            for (int j =i+1;j<length;j++) {
                Item B =getInventory().get(j);
                if(A.getSKU().equals(B.getSKU())){
                    B.setSKU("");
                }
            }
        }

    }

    @Override
    public void removeItem(String SKU){
        for(int i=0;i<inventory.size();i++){
            if(inventory.get(i).getSKU().equals(SKU)){
                inventory.remove(i);
            }
        }
    }

}
