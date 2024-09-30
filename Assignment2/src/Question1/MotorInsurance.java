package Question1;

 class MotorInsurance extends Insurance {
    private double idv;
    private float depPercent;

    public double getIdv(){
        return idv;
    }
    public float getDepPercent(){
        return depPercent;
    }
    public MotorInsurance(String insuranceNo,String insuranceName, double amountCovered, float depPercent) {
        super(insuranceNo,insuranceName,amountCovered);
        this.depPercent = depPercent;
        this.idv = CalculateIDV();
    }
    private double CalculateIDV(){
        return getAmountCovered() - ((getAmountCovered() * depPercent) / 100);
    }
    public double calculatePremium(){
        return (0.03 * idv);
    }
}
