package com.jsantos.structuralpatterns.adapterpattern.employeesdemo;
import lombok.Getter;
import lombok.ToString;

import java.util.StringTokenizer;

/**
 * Created by jsantos on 9/13/17.
 */
@Getter
@ToString
public class EmployeeCSV {
    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;

    public EmployeeCSV(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            firstname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            lastname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }
}
