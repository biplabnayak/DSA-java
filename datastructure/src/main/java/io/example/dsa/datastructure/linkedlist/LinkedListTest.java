package io.example.dsa.datastructure.linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        SingleLinkedList<String> l = new SingleLinkedList<>();
        l.append("a");
        l.append("b");
        l.append("c");
        l.append("d");
        l.prepend("0");
        l.reverse();
        l.printList();

        l.add("x", 2);
        l.printList();

        l.remove(4);
        l.printList();

        System.out.println(l.get(2));
    }
}
