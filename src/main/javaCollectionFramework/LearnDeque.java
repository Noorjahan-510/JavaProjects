package javaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnDeque {
    public static void main(String[] args) {
//        ArrayDeque<Integer> adq = new ArrayDeque<>();
//        adq.offer(10);
//        adq.offerLast(20);
//        adq.offerFirst(30);
//        System.out.println(adq);
//
//        System.out.println(adq.poll());
//        System.out.println(adq.pollLast());
//        System.out.println(adq.peek());

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("queue " +q);
        System.out.println(q.poll());

    }
}
