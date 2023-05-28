package main.java.binary;

import java.util.Stack;

public class BinaryTree {

    public static void main(String[] args) {
        createNodes();
    }

   public static class Node{
        public int val;
       public Node left;
       public Node right;
        public Node(int val){
            this.val = val;
            this.left =null;
            this.right =null;
        }

    }

     static void createNodes(){
        Node a = node(1);
        Node b = node(2);
        Node c = node(3);
        Node d = node(4);
        Node e = node(5);
        Node f = node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        e.right = f;

        depFirstValues(a);

    }

    public static void depFirstValues(Node root){
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.add(root);

        while (nodeStack.size() > 0){
            Node current = nodeStack.pop();
            System.out.println(current.val);
            if (current.left != null) {
                nodeStack.push(current.left);
            }
            if (current.right != null) {
                nodeStack.push(current.right);
            }

        }
    }

    static Node node(int val){
        return new Node(val);
    }
}
