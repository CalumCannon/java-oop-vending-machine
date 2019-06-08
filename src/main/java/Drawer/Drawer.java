package Drawer;

import Products.Product;

public class Drawer {

    private DrawerCode code;
    private Product product;
    private int stock;

    public Drawer(DrawerCode code, Product product, int stock){
        this.code = code;
        this.product = product;
        this.stock = stock;
    }

    public DrawerCode getCode() {
        return code;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Product returnOneItem(){
        if(stockLeft()){
            return this.product;
        }
        return null;
    }

    private boolean stockLeft(){
        return (this.stock > 0);
    }

    private void reduceStock(){
        this.stock -= 1;
    }
}
