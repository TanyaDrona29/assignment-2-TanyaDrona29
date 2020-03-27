/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;
import problem3.node.Node;

public class MyPriorityQueue {
    Node front = null;
    Node rear = null;

    public void enquue(int data) {
        Node queue = new Node(data);
        if (this.rear == null) {
            this.rear = queue;
            this.front = queue;
            return;
        }
        this.rear.node = queue;
        this.rear = queue;
    }
    public void isEmpty() {
        if (rear == null && front == null) {
            return;
        }
    }
    public void sort(Node node) {
        if (rear == null && front == null) {
            return;
        }
        int data = node.getData();
        sort(node);
        enquue(data);
    }
}

