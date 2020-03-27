/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;
// to define node properties
public class Node {
    public Node next = null;
    int data = 0;

    public Node(Node next, int data) {
        this.next = next;
        this.data = data;
    }
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
