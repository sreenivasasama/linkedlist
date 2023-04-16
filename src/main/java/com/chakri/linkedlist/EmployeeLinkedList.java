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

    public void removeNode(String name) {
        EmployeeNode current = head;
        while(current != null) {
            if(current.getEmployee().getFirstName().equals(name)) {
                System.out.println("removing " + current.getEmployee().getFirstName());
                current.setEmployee(current.getNext().getEmployee());
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }

    }

    public EmployeeNode reverseList(){
        if(head == null)
            return null;

        EmployeeNode prev = null;
        while(head!= null){
            EmployeeNode nextNode = head.getNext();
            head.setNext(prev);
            prev = head;
            head = nextNode;

        }
        head = prev;
        return prev;
    }
}
