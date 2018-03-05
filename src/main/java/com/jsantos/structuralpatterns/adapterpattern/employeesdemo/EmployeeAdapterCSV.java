package com.jsantos.structuralpatterns.adapterpattern.employeesdemo;

import lombok.ToString;

/**
 * This is to solve getting an EmployeeAdapterCSV object to adapt to an Employee.
 * Created by jsantos on 9/13/17.
 */
@ToString
public class EmployeeAdapterCSV implements Employee {
    private EmployeeCSV instance;

    /**
     * This takes an {@link EmployeeCSV} object and adapts it to Employee methods.
     *
     * @param instance
     */
    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return Integer.toString(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
