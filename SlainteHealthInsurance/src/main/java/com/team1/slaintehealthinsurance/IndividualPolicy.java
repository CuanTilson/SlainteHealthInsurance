package com.team1.slaintehealthinsurance;

/**
 *
 * @author Sam Bradley, Jessica Hoey, Florian Moise, Marvin Santos, Cúán Tilson
 */
public class IndividualPolicy extends Policy {

    //Constructors
    public IndividualPolicy() {
        super();
    }

    /**
     * @param policyType
     * @param hospitalCover
     * @param dayToDayExpenses
     * @param total
     * @param idNumber
     * @param formattedNumber
     */
    //Know all information
    public IndividualPolicy(String policyType, String hospitalCover, String dayToDayExpenses, float total, int idNumber, String formattedNumber) {
        super(policyType, hospitalCover, dayToDayExpenses, total, idNumber, formattedNumber);
    }

    //Know everything but the total
    public IndividualPolicy(String policyType, String hospitalCover, String dayToDayExpenses, int idNumber, String formattedNumber) {
        super(policyType, hospitalCover, dayToDayExpenses, idNumber, formattedNumber);
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
