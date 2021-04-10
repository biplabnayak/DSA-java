package io.example.dsa.core.collection.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>((Comparator.comparingInt(Student::getRollNum)));

    }


    public static class Student {
        int rollNum;
        int name;

        public int getRollNum() {
            return rollNum;
        }

        public void setRollNum(int rollNum) {
            this.rollNum = rollNum;
        }

        public int getName() {
            return name;
        }

        public void setName(int name) {
            this.name = name;
        }
    }
}
