/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
        myPriorityQueue.enquue(5);
        myPriorityQueue.enquue(10);
        myPriorityQueue.enquue(2);
        myPriorityQueue.sort(myPriorityQueue.getRear());
        System.out.println("Queue" + myPriorityQueue.toString());

    }
}
