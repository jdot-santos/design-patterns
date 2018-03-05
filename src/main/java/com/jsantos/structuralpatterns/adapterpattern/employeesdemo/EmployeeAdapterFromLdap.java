package com.jsantos.structuralpatterns.adapterpattern.employeesdemo;
import lombok.ToString;

/**
 * EmployeeAdapterFromLdap is an solution to getting an EmployeeLdap object to adapt to an Employee.
 *
 * Another alternative to doing this would be to simply add a `implements Employee` to EmployeeLdap, but in this example we
 * are assuming that we cannot edit EmployeeLdap
 *
 * Created by jsantos on 9/12/17.
 */
@ToString
public class EmployeeAdapterFromLdap implements Employee {

    /**
     * This takes an EmployeeLdap object and adapts it to Employee methods.
     * @param employeeFromLdap
     */
    public EmployeeAdapterFromLdap(EmployeeLdap employeeFromLdap) {
        this.instance = employeeFromLdap;
    }

    private EmployeeLdap instance;

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
