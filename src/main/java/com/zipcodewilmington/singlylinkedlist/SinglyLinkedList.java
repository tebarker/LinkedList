package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
//https://www.andrew.cmu.edu/course/15-121/lectures/Linked%20Lists/linked%20lists.html
//LinkedLists pg512, Inner Classes pg357: Core Java
// this is what an empty linked list looks like List<Integer> intList = new LinkedList<>();
// A singly linked list is one where each node holds a single reference to the next node.
//Node possibly refers to each object/element inside the list...
public class SinglyLinkedList {
    Node head;
    Node tail; //the last node has a reference to null so if tail == null that's your last node


    Node prev;
    Integer index;
    Integer size;
    Integer count;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public class Node {
        //Your linked list must have a *NODE* inner class to represent each element.
       // LinkedList ll = new LinkedList();
        //head refers to the first element in a linked list
        //head.next refers to the second element. head.next.next refers to the 3rd element and so on.
        private final Node node;
        public Node prev;
        Node next;
        Node item;
        public Node(Node node) {
            this.node = node;
            this.next = null;
        }
    }
    public void add(Node node){
        Node node1 = new Node(node);
        head = node1;
        if(head == null){
            tail = node1;
        }
        else { tail.next = node1;
            tail = node1;
          size++;
          count++;
        }

        }
    public Node remove(Integer index){
        Node element = head.item;
        Node next = head.next;
        head.item = null;
        head.next = null;
        if (next == null)
            tail = null;
        else
            next.prev = null;
        size--;
        count++;
        return element;
    }
    }









