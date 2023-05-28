package main.java;

import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    static class Node{
        public Node(){}
        public Node(int data){
            this.data = data;
        }
        int data;
        Node next =null;
    }

    static int max =0;
    private static int reset(int counter){
        Set<Integer> s = new HashSet<>();
        for (Integer integer : s) {
           // System.out.println(integer);
           // "".split().le
        }
        if(counter > max){
            max = counter;
        }
        counter =0;
        return max;
    }

    @SuppressWarnings("unused variable")
    public static void main(String[] args) {

        Node node = new Node();
        node.data =1;

        Node node1 = new Node();
        node1.data =2;
        node.next = node1;

        Node node2 = new Node();
        node2.data =3;
        node1.next = node2;

        Node node3 = new Node();
        node3.data = 4;
        node2.next = node3;

        Node node4 = new Node();
        node4.data =5;
        node3.next = node4;

        Node head = node;
      //  System.out.println(loop(head));


        Node _node = new Node();
        _node.data = 10;

        Node[] nodes = new Node[]{new Node(11), new Node(9), new Node(90), new Node(11)};
        for (Node n : nodes) {
            System.out.println(reset(n.data));
        }

        Node aNode = node;

        while (aNode != null){
           // System.out.println(aNode.data);
            aNode = aNode.next;
        }

        String s =" ";

        lengthOfLongestSubstring("abcabcbb");

    }

    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty()){
            return 0;
        }

        if(s.length() == 1){
            return 1;
        }

        int count = 0;
        String[] arr = s.split("");

        String sChar = arr[0];
        Map<String, String> map = new HashMap();

        for(int i=1; i < arr.length; i++){
            String lChar = arr[i];
            if(!Objects.equals(sChar, lChar)){
                count +=1;
                System.out.println(lChar +"=="+sChar);
            }else{
                count =0;
            }
            sChar = lChar;
        }


        return count;

    }

    // Tra
    public static void traverseLinkedList(Node head){
        Node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        }while (temp != null);
    }


    private static void add(Node l1, Node nNode){
        Node head = l1;
        boolean isUpdated = false;
        Character c = Character.MIN_VALUE;

        new HashMap<String, String>().forEach((s, s2) -> {

        });

        Node node = new Node();
        while(head != null){
            if(head.next ==null && !isUpdated){
                Node newNode = new Node();
                newNode.data = nNode.data;
               // System.out.println(""+newNode);
                head.next = newNode;
                isUpdated = true;
            }
            node.next = head.next;
            head = head.next;
        }

        l1 = node;
    }

    private static int loop(Node head){
        Node temp = head;
        if(temp.next ==null){
            return temp.data;
        }
        temp = temp.next;
        return loop(temp);
    }

}