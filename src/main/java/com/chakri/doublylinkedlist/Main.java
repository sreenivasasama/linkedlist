package com.chakri.doublylinkedlist;

import com.chakri.linkedlist.Employee;
import com.chakri.linkedlist.EmployeeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        List<com.chakri.linkedlist.Employee> employeeList = new ArrayList<>();

        com.chakri.linkedlist.Employee emp1 = new com.chakri.linkedlist.Employee("Sreen" , "Sam", 1);
        com.chakri.linkedlist.Employee emp2 = new com.chakri.linkedlist.Employee("Shail" , "Ray" , 2);
        com.chakri.linkedlist.Employee emp3 = new Employee("Rishik", "Sam", 3);
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
