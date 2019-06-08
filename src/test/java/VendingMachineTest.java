import CoinManagement.CoinType;
import Drawer.DrawerCode;
import Products.Product;
import VendingMachine.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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

    @Test
    public void canMakeSelection() {
        machine.setSelected(DrawerCode.A1);
        assertEquals(50, machine.getSelectedPrice());
    }

    @Test
    public void canMakePurchase() {
        Product purchasedItem;
        machine.setSelected(DrawerCode.A1);
        machine.addCoin(CoinType.POUND);
        purchasedItem = machine.purchaseSelected();
        assertEquals("Crisp", purchasedItem.getName());
    }

    @Test
    public void onlyReturnsProductIfEnoughMoneyHasBeenEntered() {
        Product purchasedItem;
        machine.setSelected(DrawerCode.A1);
        purchasedItem = machine.purchaseSelected();
        assertNull(purchasedItem);
    }
}
