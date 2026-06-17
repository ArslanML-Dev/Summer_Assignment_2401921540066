import java.util.Stack;

class MinStack {

    private Stack<Integer> elementStack;
    private Stack<Integer> minStack;

    public MinStack() {
        elementStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        elementStack.push(value);
        if (minStack.isEmpty() || minStack.peek() >= value) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (elementStack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        elementStack.pop();
    }

    public int top() {
        return elementStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
