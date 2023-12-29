package com.team1.slaintehealthinsurance;

import java.util.ArrayList;

/**
 *
 * @author it122
 */
public class CustomerPolicyUnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Customer 1  (Test data from FOOP Template)
        ArrayList<String> c1HealthCondition = new ArrayList<>();
        c1HealthCondition.add("Bone Marrow and Immune System");
        c1HealthCondition.add("Lungs");

        Customer c1 = new Customer("Derek", "Duggan", "Male", "Under 35", "Non-Smoker", c1HealthCondition, "");
        IndividualPolicy IdivP1 = new IndividualPolicy("Individual Policy", "Public Hospital", "Standard", 2, "%04d" + 2);
        IdivP1.calculatePremium(c1);

        System.out.println("\n*** First Quote ***\n");
        System.out.println(c1.toString());
        System.out.println(IdivP1.toString());

        //Customer 2
        ArrayList<String> c2HealthCondition = new ArrayList<>();
        c2HealthCondition.add("None");

        Customer c2 = new Customer("Sarah", "Doyle", "Female", "35 to 55 inclusive", "Smoker", c2HealthCondition, "Yes");
        IndividualPolicy IdivP2 = new IndividualPolicy("Individual Policy", "Comprehensive Hospital", "Enhanced", 3, "%04d" + 3);
        IdivP2.calculatePremium(c2);

        System.out.println("\n*** Second Quote ***\n");
        System.out.println(c2.toString());
        System.out.println(IdivP2.toString());

        //Customer 3
        ArrayList<String> c3HealthCondition = new ArrayList<>();
        c3HealthCondition.add("Cancer");

        Customer c3 = new Customer("Donald", "Russell", "Male", "Under 35", "Smoker", c3HealthCondition, "");
        IndividualPolicy IdivP3 = new IndividualPolicy("Individual Policy", "Private Hospital", "Standard", 4, "%04d" + 4);
        IdivP3.calculatePremium(c3);

        System.out.println("\n*** Third Quote ***\n");
        System.out.println(c3.toString());
        System.out.println(IdivP3.toString());

        //Customer 4
        ArrayList<String> c4HealthCondition = new ArrayList<>();
        c4HealthCondition.add("Lungs");

        Customer c4 = new Customer("Paul", "Kelly", "Male", "Over 70", "Non-Smoker", c4HealthCondition, "");
        IndividualPolicy IdivP4 = new IndividualPolicy("Individual Policy", "Public Hospital", "Standard", 4, "%04d" + 4);
        IdivP4.calculatePremium(c4);

        System.out.println("\n*** Fourth Quote ***\n");
        System.out.println(c4.toString());
        System.out.println(IdivP4.toString());

        //Customer 5
        ArrayList<String> c5HealthCondition = new ArrayList<>();
        c5HealthCondition.add("Kidneys");

        Customer c5 = new Customer("Paddy", "Murphy", "Male", "56 to 70 inclusive", "Smoker", c5HealthCondition, "");
        CorporatePolicy CorpP1 = new CorporatePolicy("Corporate Policy", "Comprehensive Hospital", "Comprehensive", 1, "%04d" + 1);
        CorpP1.calculatePremium(c5);

        System.out.println("\n*** Fifth Quote ***\n");
        System.out.println(c5.toString());
        System.out.println(CorpP1.toString());

        //Customer 6   
        ArrayList<String> c6HealthCondition = new ArrayList<>();
        c6HealthCondition.add("Infections");
        c6HealthCondition.add("Kidneys");

        Customer c6 = new Customer("Chuck", "Trump", "Male", "Under 35", "Non-Smoker", c6HealthCondition, "Yes");
        IndividualPolicy IdivP5 = new IndividualPolicy("Individual Policy", "Private Hospital", "Enhanced", 5, "%04d" + 5);
        IdivP5.calculatePremium(c6);

        System.out.println("\n*** Sixth Quote ***\n");
        System.out.println(c6.toString());
        System.out.println(IdivP5.toString());

        //Customer 7
        ArrayList<String> c7HealthCondition = new ArrayList<>();
        c6HealthCondition.add("None");

        Customer c7 = new Customer("Barry", "Kiely", "Male", "35 to 55 inclusive", "Non-Smoker", c7HealthCondition, "");
        CorporatePolicy CorpP3 = new CorporatePolicy("Corporate Policy", "Public Hospital", "Standard", 7, "%04d" + 7);
        CorpP3.calculatePremium(c7);

        System.out.println("\n*** Seventh Quote ***\n");
        System.out.println(c7.toString());
        System.out.println(CorpP3.toString());

        //Customer 8
        ArrayList<String> c8HealthCondition = new ArrayList<>();
        c6HealthCondition.add("None");

        Customer c8 = new Customer("Daniel", "Cooper", "Male", "35 to 55 inclusive", "Smoker", c8HealthCondition, "");
        IndividualPolicy IdivP6 = new IndividualPolicy("Individual Policy", "Public Hospital", "Comprehensive", 8, "%04d" + 8);
        IdivP6.calculatePremium(c8);

        System.out.println("\n*** Eight Quote ***\n");
        System.out.println(c8.toString());
        System.out.println(IdivP6.toString());
    }

}
