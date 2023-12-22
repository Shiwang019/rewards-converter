public class RewardValue {
    private double cashValue;
    private double milesValue;

    //Constructor that accepts cash value
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue= convertCashToMiles(cashValue);

    }

    //Constructor that accepts miles value
    public RewardValue(int milesValue){
        this.milesValue= milesValue;
        this.cashValue= convertMilesToCash(milesValue);
    }
    private double convertMilesToCash(double milesValue){
        return milesValue * 0.0035;
    }
    private double convertCashToMiles(double cashValue){
        return cashValue / 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

