package CoinManagement;

import java.util.ArrayList;
import java.util.List;

public class CoinReturn {

   private ArrayList<CoinType> coins;

   public CoinReturn(){
       this.coins = new ArrayList<CoinType>();
   }

   public void addCoin(CoinType coin){
           this.coins.add(coin);
   }

   public int getCoinsValue(){
       if(coins.size() == 0){
           return 0;
       }

       int value = 0;
       for(CoinType coin : coins){
           value += coin.getValue();
       }
       return value;
   }

   public List<CoinType> returnCoins(){
       List<CoinType> returnList = this.coins;
       this.coins.clear();
       return returnList;
   }

}
