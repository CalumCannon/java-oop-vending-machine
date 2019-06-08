import CoinManagement.CoinType;
import VendingMachine.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine machine;

    @Before
    public void setUp(){
        machine = new VendingMachine();
    }

    @Test
    public void testCanAddCoinsToMachine() {
        machine.addCoin(CoinType.FIFTY);
        assertEquals(50, machine.getCoinsValue());
    }

    @Test
    public void testRejectingCoins() {
        machine.addCoin(CoinType.ONE);
        assertEquals(0, machine.getCoinsValue());
    }
}
