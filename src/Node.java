/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class Node {

    Node next;
    Integer data;

    public Node(int dataPortion) {
        this(dataPortion, null);
    }

    public Node(Integer dataPortion, Node nextNode) {
        data = dataPortion;
        next = nextNode;
    }

    @Override
    public String toString() {
        return data + "; ";
    }

    public void orderedPrint() {
        if (this.next == null) {
            System.out.print(this);
            return;
        }
        this.next.orderedPrint();
        System.out.print(this);
    }

    public void reversePrint() {
        System.out.print(this);
        if (this.next == null) {
            return;
        }
        this.next.reversePrint();
    }

    public Node reverseOrder(Node root) {

        if (root == null) {
            return null;
        }
        if (root.next == null) {
            return root;
        }

        Node temp = root.next;
        root.next = null;
        Node rN = reverseOrder(temp);
        temp.next = root;
        return rN;
    }
}
