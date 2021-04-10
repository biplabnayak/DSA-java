package io.example;

public class ReverseLinkedList {

    Node start;
    Node last;
    Integer size;

    public void add(Object element) {
        if (start == null) {
            start = new Node(element, null);
        } else {
            Node n = new Node(element, null);
            last.setNext(n);
            last = n;
        }
    }

    public ReverseLinkedList reverseList() {
        ReverseLinkedList rl = new ReverseLinkedList();
        Node node = start;
        Node prev = null;
        Node next = null;
        while (node.next != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = node.next;
        }

    }

    private static class Node {
        Object data;
        Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
