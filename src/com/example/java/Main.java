package com.example.java;
import com.example.java.employee.employee;
public class Main {

    public static void main(String[] args) {
        //first employee
        employee emp1 = new employee("Emily", "Rainer", "123456",2);
        //second employee
        employee emp2 = new employee("Billy", "Bobjoe", "567865", 3);
        //third employee
        employee emp3 = new employee("Manual", "Thomas", "345678",1);
        //print out the header
        emp1.printHeader();

        //print out the employees information
        emp1.printEmp();
        emp2.printEmp();
        emp3.printEmp();



    }
}

