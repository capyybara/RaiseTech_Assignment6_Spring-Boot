package com.Assignment6.helloworld;

public class Name {

    private String Firstname;
    private String Lastname;

    public Name(String Firstname, String Lastname) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
}
