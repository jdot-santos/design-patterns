package com.jsantos.behavioralpatterns.memento.fullfledged;

import java.util.Stack;

/**
 * Caretaker.
 *
 * There's many ways to implement the Caretaker (e.g., Arraylist, Stack)
 */
public class Caretaker {

    private Stack<EmployeeMemento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }

    public void revert(Employee emp) {
        emp.revert(employeeHistory.pop());
    }
}
