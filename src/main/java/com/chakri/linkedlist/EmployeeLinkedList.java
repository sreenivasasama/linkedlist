package com.chakri.linkedlist;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){

        EmployeeNode employeeNode= new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return(head == null);
    }

    public void printList(){
        EmployeeNode current = this.head;
        System.out.print("HEAD ==> ");
        while(current != null) {
            System.out.print(current.getEmployee().toString());
            System.out.print( " ==> ");
            current = current.getNext();
         }
        System.out.println("null");

    }
}
