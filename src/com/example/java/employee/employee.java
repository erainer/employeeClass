package com.example.java.employee;

import java.util.Scanner;

public class employee {
    //variables
    private String firstName;
    private String lastName;
    private String idNum;
    private int shift;
    //init
    public employee(String firstName, String lastName, String idNum, int shift){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNum = idNum;
        this.shift = shift;
    }
    //returns the first name
    public String getfirstName(){
        return firstName;
    }
    //sets the first name
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    //returns the last name
    public String getlastName(){
        return lastName;
    }
    //sets the last name
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    //returns the id number
    public String getId(){
        return idNum;
    }
    //sets the id number
    public void setId( String idNum){
        this.idNum = idNum;
    }
    //returns the shift
    public int getShift(){
        return shift;
    }
    //sets the shift
    public void setShift(int shift) {
        this.shift = shift;
    }
    //Print out the header
    public void printHeader(){
        System.out.println("--------------Employees-----------------------");
        System.out.println("| First name | Last name | ID Number | Shift |");
        System.out.println("----------------------------------------------");
    }
    //Prints out the employee information
    public void printEmp(){
        System.out.println("|" + firstName + "\t\t |" + lastName + "\t |" + idNum + "\t |   " + shift + "\t |");
    }

}
