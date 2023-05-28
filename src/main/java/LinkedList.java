package main.java;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {


    List<T> linkedAsList = new ArrayList<>();

    private final LinkedList.Node<T> lNode;

    LinkedList(){
        lNode = new LinkedList.Node<>(null);
    }

    static class Node<T>{
        T value;
        public Node(T value){
            this.value = value;
        }
        Node<T> next =null;
    }

    public static void main(String[] args) {
//        Node node = new Node(1);
//        Node node1 = new Node(11);
//        node.next = node1;
//        Node node2 = new Node(13);
//        node1.next = node2;
//        Node node3 = new Node(44);
//        node2.next = node3;
//
//        Node _node = new Node(10);
//        Node _node1 = new Node(2);
//        _node.next = _node1;
//        Node _node2 = new Node(1);
//        _node1.next = _node2;
//        Node _node3 = new Node(4);
//        _node2.next = _node3;
//        Node _node4 = new Node(20);
//        _node3.next =_node4;
//        Node _node5 = new Node(7);
//        _node4.next =_node5;
//        Node _node6 = new Node(40);
//        _node5.next =_node6;
//
//        zip(node, _node);

        LinkedList list = new LinkedList();
        list.add(2);

        list.linkedAsList.forEach(n ->{
            System.out.println(n);
        });
    }

    private static void print(Node head){
        Node current = head;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }

    private static void printRecursive(Node head){
        if (head == null){
            System.out.print("-> NULL");
            return;
        };
        System.out.print(head.value+"->");
        printRecursive(head.next);
    }
//
//    private static List<Integer> linkedList(Node head){
//        List<Integer> list = new ArrayList<>();
//        Node current = head;
//        while (current != null){
//            list.add(current.value);
//            current = current.next;
//        }
//        return list;
//    }
//
//    private static void printFillRecurse(Node head){
//        List<Integer> list = new ArrayList<>();
//        fillRecursively(head, list);
//        list.forEach(System.out::println);
//    }
//
//    private static void fillRecursively(Node head, List<Integer> values){
//        if (head == null)return;
//        values.add(head.value);
//        fillRecursively(head.next, values);
//    }
//
//    // Summing up linked list values
//    private static int sum(Node head){
//        int result =0;
//        Node current = head;
//        while (current != null){
//            result += current.value;
//            current = current.next;
//        }
//        return result;
//    }
//
//
//    private static int sumRecursively(Node head){
//        if (head ==null)return 0;
//        return head.value + sumRecursively(head.next);
//    }
//
//    private static boolean find(Node head, int query){
//        Node current = head;
//        while (current != null){
//            if (current.value ==query){
//                return true;
//            }
//            current = current.next;
//        }
//        return false;
//    }
//
//    private static boolean findRecursively(Node head, int q){
//        if (head ==null)return false;
//        return head.value == q || findRecursively(head.next, q);
//    }
//
//    private static int getValue(Node head, int index){
//        Node current = head;
//        while (current != null){
//            if (index == 0){
//                return current.value;
//            }
//            index--;
//            current =current.next;
//        }
//        return -1;
//    }
//
//    private static int getValRecursively(Node head, int index){
//        if (head == null)return -1;
//        if (index == 0){
//            return head.value;
//        }
//        return getValRecursively(head.next, index-1);
//    }

    private static Node reverse(Node head){
        Node current = head;
        Node prev = null;
        List<Integer> list = new ArrayList<Integer>();
        while (current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static Node reverseRecurse(Node head, Node prev){
        if (head == null)return prev;
        Node next = head.next;
        head.next = prev;
        return reverseRecurse(next, head);
    }


    private static Node zipRecursion(Node _head, Node _head1){
        if (_head ==null && _head1 ==null){
            return null;
        }
        if (_head == null){
            System.out.println("___"+_head1.value);
            return _head1;
        }
        if (_head1 == null){
            System.out.println("___"+_head.value);
            return _head;
        }

        Node next1 = _head1.next;
        Node next = _head.next;
        _head.next = _head1;
        _head1.next = zipRecursion(next, next1);
        return _head;
    }

    private static Node zipper(Node head, Node head1){
        Node tail = head;
        Node current1 = head.next;
        Node current2 = head1;
        int count =0;

        while (current1 != null && current2 != null){
            if (count % 2==0){
                tail.next = current2;
                current2 = current2.next;
            }else{
                tail.next = current1;
                current1 = current1.next;
            }

            tail = tail.next;
            count +=1;
        }

        if (current1 != null){
            tail.next = current1;
        }

        if (current2 != null){
            tail.next =current2;
        }
        return head1;
    }
    private static void zip(Node head, Node head1){
        Node _head = head;
        Node _head1 = head1;
        int count=-1;

        while (true){

            count += 1;

            if (count % 2 == 0){
                if (_head1 != null){
                    System.out.print(_head1.value +"->");
                    _head1 = _head1.next;
                }
            } else{
                if (_head != null){
                    System.out.print(_head.value+"->");
                    _head = _head.next;
                }
            }

            if (_head1 == null && _head == null){
                return;
            }

        }
    }

    public void add(T value){
        Node<T> head = lNode;
        boolean isUpdated = false;

        while(head != null){

            if(head.value ==null && !isUpdated){
                head.value = value;
                isUpdated = true;
            }

            if(head.next ==null && !isUpdated){
                LinkedList.Node<T> newNode = new LinkedList.Node<T>(value);
                System.out.println(""+newNode);
                head.next = newNode;
                isUpdated = true;
            }
            linkedAsList.add(head.value);
            head = head.next;
        }
    }


}
