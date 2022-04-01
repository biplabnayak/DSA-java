package io.example.dsa.datastructure.linkedlist;

public class SingleLinkedList<E> {
    
    private Node<E> start;
    private Integer length = 0;
    
    public void append(E e) {
        if (start == null) {
            start = new Node<>(e, null);
        } else {
            Node last = start;
            while (last.next != null) {
                last = last.next;
            }
            last.setNext(new Node(e, null));
        }
        length++;
    }

    public void add(E e) {
        append(e);
    }

    public void add(E e, Integer index) {
        if (index > length || index < 0) {
            throw new IllegalStateException();
        } else if (index == 0) {
            prepend(e);
        } else {
            Node prev = getNodeByIndex(index - 1);
            Node<E> newNode = new Node<>(e, prev.next);
            prev.next = newNode;
            length++;
        }

    }


    public void prepend(E e) {
        Node<E> n = new Node<>(e, start);
        start = n;
        length++;
    }

    public E get(Integer index) {
        return getNodeByIndex(index).element;
    }

    private Node<E> getNodeByIndex(Integer index) {
        if (index >= length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Node<E> e = start;
        int i = 0;
        while (i < index) {
            i++;
            e = e.next;
        }
        return e;
    }
    
    public void printList() {
        if (start == null) {
            System.out.println("List is Empty");
        } else {
            System.out.println();
            Node n = start;
            while (n != null) {
                System.out.print(n.element);
                System.out.print(",");
                n = n.next;
            }
        }
        System.out.println();
    }

    public void remove(Integer index) {
        if (index >= length || index < 0) {
            throw new IndexOutOfBoundsException();
        } else if(index == 0) {
            this.start = this.start.next;
            length--;
        }else {
            Node<E> prev = getNodeByIndex(index-1);
            prev.next = prev.next.next;
            length --;
        }
    }

    // 1 -> 2 -> 3 -> null
    public void reverse() {
        if (this.start.next == null) {
            return;
        } else {
            Node first = start;
            Node second = start.next;

            while (second != null) {
                Node temp = second.next;
                second.next = first;
                first = second;
                second = temp;
            }
            start.next = null;
            start = first;
        }
    }
    
    public static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
