/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

class Student{
    private String name;
    private int roll;

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}

public class Node {
    Student stu;
    Node next;

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Student getStu() {
        return stu;
    }

    public Node getNext() {
        return next;
    }
}
