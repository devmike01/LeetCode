package main.java.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class MutableLinkedList<T> implements LinkedList<T> {


    Object[] linkedAsList;

    private final Node<T> lNode;

    private int count;

    MutableLinkedList(int initialCapacity){

        if (initialCapacity >0){
            linkedAsList = new Object[initialCapacity];
        }else{
            linkedAsList = new Object[]{};
        }

        lNode = new Node<>(null);
    }

    private static class Node<T>{
        T value;
        public Node(T value){
            this.value = value;
        }
        Node<T> next =null;
    }

    @Override
    public void add(T value){
        count =0;
        Node<T> head = lNode;
        boolean isUpdated = false;

        // Increase the size of array to accommodate more node(s)
        linkedAsList = new Object[linkedAsList.length+1];

        while(head != null){
            if(head.value ==null && !isUpdated){
                head.value = value;
                isUpdated = true;
            }

            if(head.next ==null && !isUpdated){
                Node<T> newNode = new Node<T>(value);
                System.out.println(""+newNode);
                head.next = newNode;
                isUpdated = true;
            }
            linkedAsList[count] = count;
            head = head.next;
            count +=1;
        }
    }

    @Override
    public int size() {
        return count;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        return ((T)linkedAsList[index]);
    }

    @Override
    public void set(int index, T value) {
        linkedAsList[index] = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> toList() {
        List<T> list = new ArrayList<>();
        for (Object o : linkedAsList) {
            list.add((T)o);
        }
        return list;
    }


}
