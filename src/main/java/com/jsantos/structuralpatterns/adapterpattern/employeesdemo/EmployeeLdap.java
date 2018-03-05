package com.jsantos.structuralpatterns.adapterpattern.employeesdemo;
import lombok.Getter;
import lombok.ToString;

/**
 * EmployeeLdap is used to show how the adapter pattern works.
 *
 * Created by jsantos on 9/12/17.
 */
@Getter
@ToString
public class EmployeeLdap {
    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeLdap(String cn, String surname, String givenName, String mail) {
        this.cn = cn;
        this.surname = surname;
        this.givenName = givenName;
        this.mail = mail;
    }

}
