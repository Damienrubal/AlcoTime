package com.example.damin.myapplication.DataBase;

/**
 * Created by damin on 25/01/2017.
 */

public class Person {
    private int ID;
    private String firstName;
    private String lastName;
    private int  weight;
    private String sexe;

    public Person(){
    }

    public Person(String firstName,String lastName,int weight,String sexe) {

        this.firstName=firstName;
        this.lastName=lastName;
        this.weight=weight;
        this.sexe=sexe;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Last name : "+lastName +"/n"+"first name : "+firstName +"/n"+"Weight: "+weight +"/n"+"Sexe: "+sexe +"/n";
    }
}
