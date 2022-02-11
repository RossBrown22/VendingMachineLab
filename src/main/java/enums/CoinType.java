package enums;

public enum CoinType {

    ONEPENCE(0.01),
    TWOPENCE(0.02),
    FIVEPENCE(0.05),
    TENPENCE(0.1),
    TWENTYPENCE(0.2),
    FIFTYPENCE(0.5),
    ONEPOUND(1.0),
    TWOPOUND(2.0);

    private final double coinValue;

    CoinType(double coinValue) {
        this.coinValue = coinValue;
    }

    public double getCoinValue() {
        return coinValue;
    }
}
