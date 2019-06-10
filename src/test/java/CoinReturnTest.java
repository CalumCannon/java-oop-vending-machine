import CoinManagement.CoinReturn;
import CoinManagement.CoinType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    private CoinReturn coinReturn;

    @Before
    public void setUp() throws Exception {
        this.coinReturn = new CoinReturn();
    }

    @Test
    public void canReturnCoins() {
        this.coinReturn.addCoin(CoinType.POUND);
        this.coinReturn.addCoin(CoinType.ONE);
        ArrayList<CoinType> coinList = new ArrayList<CoinType>();

        coinList.add(CoinType.POUND);
        coinList.add(CoinType.ONE);

        assertEquals(coinList, this.coinReturn.returnCoins());
    }

    @Test
    public void coinReturnIsEmptyAfterReturningCoins() {
        this.coinReturn.addCoin(CoinType.POUND);
        this.coinReturn.addCoin(CoinType.ONE);
        this.coinReturn.returnCoins();
        assertEquals(0,this.coinReturn.getCoinsValue());
    }
}
