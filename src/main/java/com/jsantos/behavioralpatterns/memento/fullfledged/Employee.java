package com.jsantos.behavioralpatterns.memento.fullfledged;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * The Originator, the class we want to copy or make an instance of
 *
 * The originator is also responsible of knowing how to create a memento of itself, as well as other memento features (e.g., revert, undo)
 *
 */
@Getter
@Setter
@ToString
public class Employee {

    private String name;
    private String address;
    private String phone;

    EmployeeMemento save() {
        return new EmployeeMemento(name, phone);
    }

    void revert(EmployeeMemento employeeMemento) {
        this.name = employeeMemento.getName();
        this.phone = employeeMemento.getPhoneNumber();
    }
}
