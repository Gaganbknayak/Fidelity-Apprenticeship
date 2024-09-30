package Question1;

 class Insurance {
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    public Insurance(String insuranceName, String insuranceNo, double amountCovered) {
        this.insuranceName = insuranceName;
        this.insuranceNo = insuranceNo;
        this.amountCovered = amountCovered;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public double getAmountCovered() {
        return amountCovered;
    }
}
