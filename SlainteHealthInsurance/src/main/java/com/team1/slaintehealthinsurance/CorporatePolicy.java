package com.team1.slaintehealthinsurance;

/**
 *
 * @author Sam Bradley, Jessica Hoey, Florian Moise, Marvin Santos, Cúán Tilson
 */
public class CorporatePolicy extends Policy {

    //Instance Variables
    /**
     *
     */
    private float discount;

    /**
     * Default constructor
     */
    public CorporatePolicy() {
        super();
        this.discount = 0.9f; //10 percent discount
    }

    //Constructors
    /**
     * @param policyType
     * @param hospitalCover
     * @param dayToDayExpenses
     * @param total
     * @param idNumber
     * @param formattedNumber
     */
    //Know all information
    public CorporatePolicy(String policyType, String hospitalCover, String dayToDayExpenses, float total, int idNumber, String formattedNumber) {
        super(policyType, hospitalCover, dayToDayExpenses, total, idNumber, formattedNumber);
        this.discount = 0.9f; //10 percent discount
    }

    //Know everything but the total
    public CorporatePolicy(String policyType, String hospitalCover, String dayToDayExpenses, int idNumber, String formattedNumber) {
        super(policyType, hospitalCover, dayToDayExpenses, idNumber, formattedNumber);
        this.discount = 0.9f; //10 percent discount
    }

    // Getter and Setter 
    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * @return
     */
    @Override
    public float calculatePremium(Customer customer) {
        float netPremium = super.calculatePremium(customer) * discount;
        super.setTotal(netPremium);
        return netPremium;
    }

}
