package com.example.csaper6.collegeapp.Model;

/**
 * Created by csaper6 on 12/9/16.
 */
public class Siblings extends Person {
    private int age;
    private String relationship;

    public Siblings(){
        super();
        age = 0;
        relationship = "";
    }

    public Siblings(String firstName, String lastName, String relationship,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.relationship = relationship;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
