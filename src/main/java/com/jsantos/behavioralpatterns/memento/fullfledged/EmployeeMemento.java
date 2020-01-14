package com.jsantos.behavioralpatterns.memento.fullfledged;

/**
 * Memento
 *
 * We purposefully left out the Address, which highlights that we can worry about only the pieces we want to revert. You can include address and that's OK.
 *
 * If we're using Serializable interface.
 */
public class EmployeeMemento {
    private String name;
    private String phoneNumber;

    // set state
    public EmployeeMemento(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // get state

    /**
     * These getter methods are used by the {@link Employee} class in order to manage the reverting and saving of Employees. These shouldn't be used outside the memento pattern
     */

    String getName() {
        return name;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }
}
