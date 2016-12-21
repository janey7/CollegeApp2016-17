package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public class Guardians extends Person {
    private int age;
    private String occupation;

    public Guardians(){
        age = 40;
        occupation = "";
    }

    public Guardians(String firstName, String lastName, String occupation, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.occupation = occupation;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
     */
}
