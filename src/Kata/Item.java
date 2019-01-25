package Kata;

/**
 * Created by Anthony on 25/01/2019.
 */
public class Item {

    private String SKU;

    private int price;

    public Item(String SKU, int price){
        if(SKU.matches("[a-zA-Z]+")){
            this.SKU= SKU;
        }else{
            this.SKU= null;
        }
        this.price=price;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
