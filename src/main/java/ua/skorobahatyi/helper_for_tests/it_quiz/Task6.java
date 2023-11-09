package ua.skorobahatyi.helper_for_tests.it_quiz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *Consider the following code:
 *
 *What will the structures stack and queue contain after this code is executed?
 *
 *
 *
 *
 * Stack: [] Queue: []
 * Stack: [Apple, Banana] Queue: [Cherry, Fig, Dingleberry, Eggplant]
 * Stack: [Apple, Banana, Dingleberry, Fig, Cherry, Eggplant] Queue: [Fig, Cherry, Eggplant]
 * Stack: [Apple, Banana, Dingleberry] Queue: [Fig, Cherry, Eggplant]  (!!!!!)
 *
 * */
public class Task6 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        queue.add(stack.pop());
        stack.push("Dingleberry");
        stack.push("Eggplant");
        queue.add("Fig");
        stack.push(queue.remove());
        queue.add (stack.pop());
        queue.add (stack.pop());
        System.out.println(stack);
        System.out.println(queue);
    }
}
