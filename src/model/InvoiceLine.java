package model;

public class InvoiceLine {
    private InvoiceHeader inv;
    private String itemName;
    private Double itemPrice;
    private Double count;

    public InvoiceLine(InvoiceHeader inv, String itemName, Double itemPrice, Double count) {
        this.inv = inv;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }
    

    public InvoiceHeader getInv() {
        return inv;
    }

    public void setInv(InvoiceHeader inv) {
        this.inv = inv;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Double getCount() {
        return count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    
    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", count=" + count + '}';
    }
    
    
    public Double getTotal(){
        return itemPrice*count;
    }
}


