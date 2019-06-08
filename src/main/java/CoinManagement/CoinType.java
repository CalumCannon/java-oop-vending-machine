package CoinManagement;

public enum CoinType {

    ONE(1, false),
    TWO(2, false),

    FIVE(5, true),
    TEN(10, true),
    TWENTY(20, true),
    FIFTY(50, true),
    POUND(100, true);

    private int value;
    private boolean allowed;

    private CoinType(int value, boolean allowed){
        this.value = value;
        this.allowed = allowed;
    }

    public int getValue(){
        return this.value;
    }

    public boolean getAllowed(){
        return this.allowed;
    }

}
