/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode{
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(int item){
        data = item;
        leftNode = null;
        rightNode = null;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public int getData() {
        return data;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }
}
