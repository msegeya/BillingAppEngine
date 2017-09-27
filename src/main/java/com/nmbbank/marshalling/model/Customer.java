package com.nmbbank.marshalling.model;

public class Customer {

    private int age;
    private String firstname;
    private String lastname;

    public Customer() {
    }

    public Customer(int age, String firstname, String lastname) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        String info = String.format("Customer info: firstname = %s, lastname = %s, age = %d", firstname, lastname, age);
        return info;
    }
}
