package com.jsantos.structuralpatterns.adapterpattern.employeesdemo;
import java.util.ArrayList;
import java.util.List;

/**
 * Responsible for returning employees via the getEmployeeList() method.
 *
 * Created by jsantos on 9/12/17.
 */
public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("1120", "James", "Santos", "james@santos.com");
        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("baby-boss", "Santos", "Maleah", "jms@santos.com");
        employees.add(new EmployeeAdapterFromLdap(employeeFromLdap)); // adapter pattern

        EmployeeCSV employeeCSV = new EmployeeCSV("0630,Jourdan,Umali,jumali@santos.com");
        employees.add(new EmployeeAdapterCSV(employeeCSV)); // adapter pattern

        return employees;
    }
}
