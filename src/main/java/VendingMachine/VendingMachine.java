package VendingMachine;

import CoinManagement.Coin;
import CoinManagement.CoinReturn;
import CoinManagement.CoinType;
import Drawer.Drawer;
import Drawer.DrawerCode;
import Products.Crisp;
import Products.Drink;
import Products.Product;
import Products.Sweet;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<CoinType> coins;
    private CoinReturn coinReturn;
    private Drawer selected;

    public VendingMachine(){
        drawers = new ArrayList<Drawer>();
        coins = new ArrayList<CoinType>();
        coinReturn = new CoinReturn();
        populateDrawers();
    }

    void populateDrawers(){
        drawers.add(new Drawer(DrawerCode.A1, new Crisp(), 10));
        drawers.add(new Drawer(DrawerCode.A2, new Sweet(), 10));
        drawers.add(new Drawer(DrawerCode.A3, new Drink(), 10));
    }

    public void addCoin(CoinType coin){
        if(coin.getAllowed()){
            this.coins.add(coin);
        }else{
            coinReturn.addCoin(coin);
        }
    }

    public int getCoinsValue(){
        int value = 0;
        for(CoinType coin : coins){
            value += coin.getValue();
        }
        return value;
    }

    private Drawer findCode(DrawerCode code){
        for(Drawer drawer : drawers){
            if(drawer.getCode() == code){
                return drawer;
            }
        }
        return null;
    }

    public void setSelected(DrawerCode code) {
       this.selected = findCode(code);
      //  this.selected = selected;
    }

    public Product purchaseSelected(){
        if(getCoinsValue() >= selected.getProduct().getPrice()){
            return selected.getProduct();
        }
        //coin return? ask for more money?
        return null;
    }
}
