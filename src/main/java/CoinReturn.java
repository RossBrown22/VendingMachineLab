import enums.CoinType;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<CoinType> coins;
    private double changeReturn;

    public CoinReturn() {
        this.coins = new ArrayList<CoinType>();
        this.changeReturn = 0;
    }

    public void addTotalChangeValue(double coinValue){
        this.changeReturn += coinValue;
    }

    public void addCoin(CoinType coinType){
        coins.add(coinType);
        addTotalChangeValue(coinType.getCoinValue());
    }

}
