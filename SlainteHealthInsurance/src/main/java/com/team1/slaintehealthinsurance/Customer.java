package com.team1.slaintehealthinsurance;

import java.util.*;

/**
 *
 * @author Sam Bradley, Jessica Hoey, Florian Moise, Marvin Santos, Cúán Tilson
 */
public class Customer {

    //Instance Variables
    /**
     *
     */
    private String firstName;

    /**
     *
     */
    private String lastName;

    /**
     *
     */
    private String gender;

    /**
     *
     */
    private String age;

    /**
     *
     */
    private String smokerStatus;

    /**
     *
     */
    private ArrayList existingHealthCondition;

    /**
     *
     */
    private String other;

    //Constructors
    /**
     *
     */
    public Customer() {
        this.firstName = "First name not specified";
        this.lastName = "Last name not specified";
        this.gender = "Gender not specified";
        this.age = "Age not specified";
        this.smokerStatus = "Smoker Status not specified";
        this.existingHealthCondition = null;
        this.other = "Other health conditions not specified";
    }

    /**
     * @param firstName
     * @param lastName
     * @param gender
     * @param age
     * @param smokerStatus
     * @param existingHealthCondition
     * @param other
     */
    public Customer(String firstName, String lastName, String gender, String age, String smokerStatus, ArrayList existingHealthCondition, String other) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.smokerStatus = smokerStatus;
        this.existingHealthCondition = existingHealthCondition;
        this.other = other;
    }

    //Getter and Setter    
    /**
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return
     */
    public String getSmokerStatus() {
        return smokerStatus;
    }

    /**
     * @param smokerStatus
     */
    public void setSmokerStatus(String smokerStatus) {
        this.smokerStatus = smokerStatus;
    }

    /**
     * @return
     */
    public ArrayList getExistingHealthCondition() {
        return existingHealthCondition;
    }

    /**
     * @param existingHealthCondition
     */
    public void setExistingHealthCondition(ArrayList existingHealthCondition) {
        this.existingHealthCondition = existingHealthCondition;
    }

    /**
     * @return
     */
    public String getOther() {
        return other;
    }

    /**
     * @param other
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        // if = (other)
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nGender: " + gender
                + "\nAge: " + age + "\nSmoker Status: " + smokerStatus + "\nExisting Health Condition: "
                + existingHealthCondition + "\nOther: " + other;

    }

}
