package io.example.dsa.core.collection.linkedlist;

public class SinglyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public void addLast(E element) {
        if (size == 0) {
            head = new Node<>(element, null);
            tail = head;
            size++;
        } else {
            tail.setNext(new Node<>(element, null));
            size++;
        }
    }

    public void addFirst(E element) {
        if (size == 0) {
            head = new Node<>(element, null);
            tail = head;
            size++;
        } else {
            tail.setNext(new Node<>(element, null));
        }
    }


    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
