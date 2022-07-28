package com.zipcodewilmington.singlylinkedlist;

import java.util.LinkedList;

/**
 * Created by leon on 1/10/18.
 */
//https://www.andrew.cmu.edu/course/15-121/lectures/Linked%20Lists/linked%20lists.html
//LinkedLists pg512, Inner Classes pg357: Core Java
// this is what an empty linked list looks like List<Integer> intList = new LinkedList<>();
// A singly linked list is one where each node holds a single reference to the next node.
//Node possibly refers to each object/element inside the list...
public class SinglyLinkedList <T extends Comparable<T>> {
    Node head;
    Node tail; //the last node has a reference to null so if tail == null that's your last node


    Node prev;
    //Integer index;
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
        public Node item;
        Node next;

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
    public void remove(Integer index){
        Node currentNode = head;
        Node nextNode;

        if (currentNode != null && index == 0){
            head = currentNode.next;

            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
                nextNode = currentNode.next;
                currentNode.next = nextNode;
            }
            this.size--;
        }
    }

     public <T> boolean contains (T element){
      Node current = head;
      int index = 0;
      while (current != null){
          if (current.node.equals(element)){
              return true;
          }
          current = current.next;

          index++;
      }

         return false;
      }

    public <T> int find(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = head; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }



}













