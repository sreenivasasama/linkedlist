package com.chakri.doublylinkedlist;

public class EmployeeDoublyLinkedList {

    EmployeeNode head;
    EmployeeNode tail;
    int size;

    public void addToFront(Employee  employee ){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        if(isEmpty()) {
            tail = employeeNode;
        } else {
            head.setPrev(employeeNode);
        }
        employeeNode.setPrev(null);
        head = employeeNode;
        size++;
    }

    public void addAtLast(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setPrev(tail);
        if(isEmpty()){
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
        }
        employeeNode.setNext(null);
        tail = employeeNode;
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public Employee removeFromFront() {
        if(head == null) {
            return null;
        }
        EmployeeNode removeNode = head;
        head = head.getNext();
        head.setPrev(null);
        size--;
        return removeNode.getEmployee();
    }

    public void addAfterEmployee(Employee newEmployee, Employee oldEmployee){
        EmployeeNode node = new EmployeeNode(newEmployee);
        EmployeeNode oldEmployeeNode = head;
        while(oldEmployeeNode!=null) {
            if(!oldEmployeeNode.getEmployee().equals(oldEmployee)) {
                oldEmployeeNode = oldEmployeeNode.getNext();
            } else {
                break;
            }
        }
        System.out.println("employee found =>" + oldEmployeeNode.toString());
        if(oldEmployeeNode != null) {
            node.setNext(oldEmployeeNode.getNext());
            node.setPrev(oldEmployeeNode);
            oldEmployeeNode.getNext().setPrev(node);
            oldEmployeeNode.setNext(node);
        }
        size++;
    }

}
