package com.jsantos.structuralpatterns.adapterpattern.employeesdemo;

/**
 * Created by jsantos on 9/12/17.
 */
public class AdapterDemo {
    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();
        System.out.println(client.getEmployeeList());
    }
}
