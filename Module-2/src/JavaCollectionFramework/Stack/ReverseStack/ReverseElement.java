package JavaCollectionFramework.Stack.ReverseStack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class ReverseElement<N> {
    private LinkedList<N> stack;

    public ReverseElement(){
        stack = new LinkedList<>();
    }

    public boolean isEmpty(){
        if(stack.size() == 0){
            return true;
        }
        return false;
    }

    public void push(N element){
        stack.addFirst(element);
    }

    public N pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }
}
