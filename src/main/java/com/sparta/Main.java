package com.sparta;

import com.sparta.factory.EmployeeFactory;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] employees;
        try {
            employees = EmployeeFactory.getEmployees(100);
            System.out.println(employees[0]);
        } catch (Exception e) { // will need to change this
            e.printStackTrace();
        }
    }
}