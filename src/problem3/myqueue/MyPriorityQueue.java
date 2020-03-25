/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {
    Node front;
    Node rear;
    MyPriorityQueue(){
        front = null;
        rear = null;
    }

    public void insert(Student st){
        Node ns = new Node();
        ns.setStu(st);
        if(rear==null && front==null){
            front = ns;
            rear = ns;
        }
        else{
            rear.setNext(ns);
            rear = ns;
        }
    }

}
