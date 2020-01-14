package com.jsantos.behavioralpatterns.memento.fullfledged;

public class MementoDemo {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Employee employee = new Employee();

        employee.setName("John Wick");
        employee.setAddress("111 Main Street");
        employee.setPhone("888-555-1212");
        System.out.println("Employee before changed phone number save: " + employee);
        caretaker.save(employee);

        employee.setPhone("206-123-9876");
        caretaker.save(employee);
        System.out.println("Employee after changed phone number save: " + employee);

        employee.setPhone("425-789-1234"); // note SAVE wasn't called!
        caretaker.revert(employee);
        System.out.println("Employee after revert: " + employee);

        caretaker.revert(employee);
        System.out.println("Employee reverted to original: " + employee);
    }
}
