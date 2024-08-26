package javaCollectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);
        System.out.println(pq);   //priority queue follows min heap by default
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
