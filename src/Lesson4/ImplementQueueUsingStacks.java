package Lesson4;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public void MyQueue() {
        mainS = new Stack<>();
        helperS = new Stack<>();
    }

    public void push(int val) {
        mainS.push(val);
    }

    public int pop() {
        while (mainS.size() != 1) helperS.push(mainS.pop());
        int rem = mainS.pop();
        while (!helperS.isEmpty()) mainS.push(helperS.pop());
        return rem;
    }

    public int peek() {
        while (mainS.size() != 1) helperS.push(mainS.pop());
        int rem = mainS.pop();
        mainS.push(rem);
        while (!helperS.isEmpty()) mainS.push(helperS.pop());
        return rem;
    }

    public boolean empty() {
        return mainS.size() == 0;
    }
}
