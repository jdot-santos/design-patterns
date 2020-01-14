package com.jsantos.behavioralpatterns.memento.serialize;

import java.io.*;

/**
 * Demo showcasing the built-in serializable interface, a good example of the Memento pattern
 *
 * The originator is the Employee object
 *
 * The memento is the serialized object
 *
 * No caretaker in this example
 */
public class SerializeDemo {

    private static void serialize(Employee employee) {
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deserialize() {
        Employee employee = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mary Anderson");
        employee.setAddress("6750 S 228th St");
        employee.setPhone("(253) 395-3780");

        System.out.println("Original Employee -> " + employee);
        serialize(employee);

        Employee newEmployee = deserialize();

        System.out.println("Deserialized employee" + employee.toString());
    }
}
