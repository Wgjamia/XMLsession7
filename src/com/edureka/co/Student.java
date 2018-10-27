package com.edureka.co;

public class Student {
    private int roll;
    private String SName;
    private String Emal;
    private  int Age;
    private String Address;

    public Student(){

    }

    public Student(int roll, String SName, String emal, int age, String address) {
        this.roll = roll;
        this.SName = SName;
        Emal = emal;
        Age = age;
        Address = address;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    public String getEmal() {
        return Emal;
    }

    public void setEmal(String emal) {
        Emal = emal;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", SName='" + SName + '\'' +
                ", Emal='" + Emal + '\'' +
                ", Age=" + Age +
                ", Address='" + Address + '\'' +
                '}';
    }
}
