/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class LinkedListDriver {
    
    public static Node root;
    
    public static void main(String[] args) {

        Node tRef;
        
        root = new Node(45);
        tRef = root;
        root = new Node(32, tRef);
        tRef = root;
        root = new Node(87, tRef);
        tRef = root;
        root = new Node(12, tRef);
        tRef = root;
        root = new Node(34, tRef);
        
        System.out.print("Ordered print: ");
        root.orderedPrint();
        System.out.println();
        System.out.print("Reverse print: ");
        root.reversePrint();
    }
}
