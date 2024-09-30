package Question1;

public class LifeInsurance extends Insurance {
    private int policyTerm;
    private float benifitPercent;

    public int getPolicyTerm() {
        return policyTerm;
    }
    public float getBenifitPercent() {
        return benifitPercent;
    }
    public LifeInsurance(String insuranceNo,String insuranceName,double amountCoverred,int policyTerm, float benifitPercent) {
        super(insuranceNo,insuranceName,amountCoverred);
        this.policyTerm = policyTerm;
        this.benifitPercent = benifitPercent;
    }
    public double calculatePremium(){
        return (getAmountCovered() - ((getAmountCovered() * benifitPercent)/100)) / policyTerm;
    }
}
