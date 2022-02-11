import enums.CoinType;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers   ;
    private ArrayList<CoinType> coins;

    public VendingMachine(ArrayList<Drawer> drawers) {
        this.drawers = drawers;
        this.coins = new ArrayList<>();
    }

    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public void setDrawers(ArrayList<Drawer> drawers) {
        this.drawers = drawers;
    }

    public ArrayList<CoinType> getCoins() {
        return coins;
    }

    public void setCoins(ArrayList<CoinType> coins) {
        this.coins = coins;
    }
}
