package com.chakri.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        List<Employee> employeeList = new LinkedList<>();

        Employee emp1 = new Employee("Sreen" , "Sam", 1);
        Employee emp2 = new Employee("Shail" , "Ray" , 2);
        Employee emp3 = new Employee("Rishik", "Sam", 3);
        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();
        employeeLinkedList.addToFront(emp1);
        employeeLinkedList.addToFront(emp2);
        employeeLinkedList.addToFront(emp3);
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);

        employeeLinkedList.printList();
        System.out.println("Size of list " + employeeLinkedList.getSize());
        System.out.println("List is empty " + employeeLinkedList.isEmpty());

    }
}
