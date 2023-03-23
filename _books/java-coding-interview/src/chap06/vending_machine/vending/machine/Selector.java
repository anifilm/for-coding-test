package chap06.vending_machine.vending.machine;

import java.util.List;
import java.util.Map;

public interface Selector {
    public int checkPriceBtn(Item item);
    public void insertCoinBtn(Coin coin);
    public Map<Item, List<Coin>> buyBtn();
    public List<Coin> refundBtn();
    public void resetBtn();
}
