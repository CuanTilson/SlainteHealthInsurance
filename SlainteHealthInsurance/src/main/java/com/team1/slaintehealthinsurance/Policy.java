package com.team1.slaintehealthinsurance;

/**
 *
 * @author Sam Bradley, Jessica Hoey, Florian Moise, Marvin Santos, Cúán Tilson
 */
public class Policy {

    //Instance Variables
    /**
     *
     */
    private String policyType;

    /**
     *
     */
    private String hospitalCover;

    /**
     *
     */
    private String dayToDayExpenses;

    /**
     *
     */
    private float total;

    /**
     *
     */
    private int idNumber;

    /**
     *
     */
    private String formattedNumber;

    /**
     *
     */
    private final int BASE_QUOTE = 200;

    //Constructors
    //Know no information
    public Policy() {
        this.policyType = "Policy Type not specified";
        this.hospitalCover = "Hospital Cover not specified";
        this.dayToDayExpenses = "Day To Day Expenses not specified";
        this.total = 0.0f;
        this.idNumber = 0;
        this.formattedNumber = "%04d" + 0;
    }

    //Know all information
    public Policy(String policyType, String hospitalCover, String dayToDayExpenses, float total, int idNumber, String formattedNumber) {
        this.policyType = policyType;
        this.hospitalCover = hospitalCover;
        this.dayToDayExpenses = dayToDayExpenses;
        this.total = total;
        this.idNumber = idNumber;
        this.formattedNumber = formattedNumber;
    }

    //Know everything but the total
    public Policy(String policyType, String hospitalCover, String dayToDayExpenses, int idNumber, String formattedNumber) {
        this.policyType = policyType;
        this.hospitalCover = hospitalCover;
        this.dayToDayExpenses = dayToDayExpenses;
        this.total = 0.0f;
        this.idNumber = idNumber;
        this.formattedNumber = formattedNumber;
    }

    //Getter and Setter
    /**
     * @return
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * @param policyType
     */
    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    /**
     *
     * @return
     */
    public String getHospitalCover() {
        return hospitalCover;
    }

    /**
     *
     * @param hospitalCover
     */
    public void setHospitalCover(String hospitalCover) {
        this.hospitalCover = hospitalCover;
    }

    /**
     *
     * @return
     */
    public String getDayToDayExpenses() {
        return dayToDayExpenses;
    }

    /**
     *
     * @param dayToDayExpenses
     */
    public void setDayToDayExpenses(String dayToDayExpenses) {
        this.dayToDayExpenses = dayToDayExpenses;
    }

    /**
     *
     * @return
     */
    public float getTotal() {
        return total;
    }

    /**
     *
     * @param total
     */
    public void setTotal(float total) {
        this.total = total;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }

    public void setFormattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
    }

    /**
     *
     * @param customer
     * @return
     */
    public float calculatePremium(Customer customer) {
        total = 0.0f;

        //Gender
        if (customer.getGender().equalsIgnoreCase("Male")) {
            total = BASE_QUOTE * 2;
        } else if (customer.getGender().equalsIgnoreCase("Female")) {
            total = (float) (BASE_QUOTE * 0.7);
        }

        //Age
        if (customer.getAge().equalsIgnoreCase("Under 35")) {
            total *= 1.2;
        } else if (customer.getAge().equalsIgnoreCase("35 to 55 inclusive")) {
            total *= 1.4;
        } else if (customer.getAge().equalsIgnoreCase("56 to 70 inclusive")) {
            total *= 1.65;
        } else if (customer.getAge().equalsIgnoreCase("Over 70")) {
            total = 0;  // no quote 
        }

        //Existing Condition
        if (customer.getExistingHealthCondition().contains("None")) {
            total = total * 1;
        }
        if (customer.getExistingHealthCondition().contains("Bone Marrow and Immune System")) {
            total = (float) (total * 1.20);
        }
        if (customer.getExistingHealthCondition().contains("Cancer")) {
            total = (float) (total * 1.25);
        }
        if (customer.getExistingHealthCondition().contains("Cardiovascular disease")) {
            total = (float) (total * 1.30);
        }
        if (customer.getExistingHealthCondition().contains("Gastrointestinal")) {
            total = (float) (total * 1.10);
        }
        if (customer.getExistingHealthCondition().contains("Infections")) {
            total = (float) (total * 1.10);
        }
        if (customer.getExistingHealthCondition().contains("Kidneys")) {
            total = (float) (total * 1.25);
        }
        if (customer.getExistingHealthCondition().contains("Lungs")) {
            total = (float) (total * 1.25);
        }
        if (customer.getExistingHealthCondition().contains("Musculoskeletal")) {
            total = (float) (total * 1.30);
        }

        //Other Condition
        if (customer.getOther().equalsIgnoreCase("")) {
            total = total * 1;
        } else if (customer.getOther().equalsIgnoreCase("No")) {
            total = total * 1;
        } else {
            total = (float) (total * 1.50);
        }

        //Smoker status
        if (customer.getSmokerStatus().equalsIgnoreCase("Non-Smoker")) {
            total = total - 100;
        } else if (customer.getSmokerStatus().equalsIgnoreCase("Smoker")) {
            total = total + 75;
        }

        //Hospital Cover
        if (getHospitalCover().equalsIgnoreCase("Public Hospital")) {
            total = total * 1;
        } else if (getHospitalCover().equalsIgnoreCase("Private Hospital")) {
            total = (float) (total * 1.20);
        } else if (getHospitalCover().equalsIgnoreCase("Comprehensive Hospital")) {
            total = (float) (total * 1.30);
        }

        //Day to day expenses
        if (getDayToDayExpenses().equalsIgnoreCase("Standard")) {
            total = total * 1;
        } else if (getDayToDayExpenses().equalsIgnoreCase("Enhanced")) {
            total = (float) (total * 1.20);
        } else if (getDayToDayExpenses().equalsIgnoreCase("Comprehensive")) {
            total = (float) (total * 1.30);
        }

        return total;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Hospital Cover: " + getHospitalCover() + "\n"
                + "Day to day expenses: " + getDayToDayExpenses() + "\n"
                + "Policy type: " + getPolicyType() + "\n"
                + "Total: " + "€" + getTotal() ;
    }
}
