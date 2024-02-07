package task4.question5;

import java.util.Stack;

public class StackDS {
    private Stack<Integer> stack = new Stack<>(); // Create a Stack to store integers

    // Method to push an item onto the stack
    public void pushitem(int num) {
        stack.push(num);
    }

    // Method to pop an item from the stack
    public void popitem() {
        stack.pop();
    }

    // to print stack
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Integer element : stack) {
            sb.append(element).append(" ");
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        // Create an instance of StackDS
        StackDS stackDS = new StackDS();

        // Push items onto the stack
        stackDS.pushitem(5);
        stackDS.pushitem(10);
        stackDS.pushitem(15);
        stackDS.pushitem(20);
        stackDS.pushitem(25);



        // Print stack before popping
        System.out.println("Stack before popping: " + stackDS);

        // Pop an item from the stack
        stackDS.popitem();

        // Print stack after popping
        System.out.println("Stack after popping: " + stackDS);
    }
}
