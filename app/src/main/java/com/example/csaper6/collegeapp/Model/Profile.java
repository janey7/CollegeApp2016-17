package com.example.csaper6.collegeapp.Model;

import java.util.Date;

/**
 * Created by csaper6 on 12/7/16.
 */
public class Profile {
    private String firstName, lastName;
    private Date birthday;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
