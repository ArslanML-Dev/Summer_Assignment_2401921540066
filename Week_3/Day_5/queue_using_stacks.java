import java.util.Stack;

class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {}

    // O(n) push
    public void push(int x) {
        // Move all elements to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Insert new element
        s1.push(x);

        // Move everything back
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    // O(1) pop
    public int pop() {
        return s1.pop();
    }

    // O(1) peek
    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}
