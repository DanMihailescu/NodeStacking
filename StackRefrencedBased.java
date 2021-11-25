import java.util.*;

public class StackRefrencedBased{
    private int N;          // size of the stack
    private Node first;     // top of stack

    // helper linked list class
    private class Node {
        private char item;
        private Node next;
    }

   //Creates an empty stack.
    public StackRefrencedBased() {
        first = null;
        N = 0;
    }

   //Checks if the stack is empty
    public boolean isEmpty() {
        return first == null;
    }

   //Add the item to the stack.
    public void push(char item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    //Removes last element of the stack and returns it
    public char pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        char item = first.item;        // save item to return
        first = first.next;            // delete first node
        N--;
        return item;                   // return the saved item
    }

    //Removes all elements on the stack
    public void popAll(){
      while (!this.isEmpty()){
        char c = this.pop();
      }
    }   

    //Gets last element of a stack without changing the stack itself
    public char peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return first.item;
    }
}