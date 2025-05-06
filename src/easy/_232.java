package easy;

import java.util.Stack;

public class _232 {
    static class MyQueue {
        private Stack<Integer> pushStack, popPeekStack;


        public MyQueue() {
            pushStack = new Stack<Integer>();
            popPeekStack = new Stack<Integer>();
        }

        public void push(int x) {
            pushStack.push(x);
        }

        public int pop() {
            int poppedElement = pushStack.pop();
            while (!pushStack.isEmpty()) {
                popPeekStack.push(poppedElement);
                poppedElement = pushStack.pop();
            }
            while (!popPeekStack.isEmpty()) {
                pushStack.push(popPeekStack.pop());
            }
            return poppedElement;
        }

        public int peek() {
            int peekElement = 0;
            while (!pushStack.isEmpty()) {
                peekElement = pushStack.pop();
                popPeekStack.push(peekElement);
            }
            while (!popPeekStack.isEmpty()) {
                pushStack.push(popPeekStack.pop());
            }
            return peekElement;
        }

        public boolean empty() {
            return pushStack.isEmpty();
        }
    }
}
