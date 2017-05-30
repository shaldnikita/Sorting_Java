/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaldnikita
 */
public class BinaryTree {

    Node root;

    public void add(int value) {
        if(isEmpty())
            root=new Node(value, null);
    }

    public boolean isEmpty() {
        return root == null;
    }
}

class Node {

    Node left;

    Node right, parent;
    int value;

    public Node(int value, Node parent) {
        this.value = value;
        this.parent = parent;
    }
    
    public boolean hasChildren
}
