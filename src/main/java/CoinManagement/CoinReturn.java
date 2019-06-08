package CoinManagement;

import java.util.ArrayList;

public class CoinReturn {

   private ArrayList<CoinType> coins;

   public CoinReturn(){
       this.coins = new ArrayList<CoinType>();
   }

   public void addCoin(CoinType coin){
           this.coins.add(coin);
   }

   public int getCoinsValue(){
       int value = 0;
       for(CoinType coin : coins){
           value += coin.getValue();
       }
       return value;
   }

}
