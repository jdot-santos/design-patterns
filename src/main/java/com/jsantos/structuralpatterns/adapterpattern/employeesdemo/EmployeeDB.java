package com.jsantos.structuralpatterns.adapterpattern.employeesdemo;
import lombok.ToString;

/**
 * Created by jsantos on 9/12/17.
 */
@ToString
public class EmployeeDB implements Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;

    public EmployeeDB(String id, String firstName, String lastName, String email){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getEmail() {
        return this.email;
    }
}
