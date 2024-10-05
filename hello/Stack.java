/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


public class Stack {
    int SIZE;
    int[] stack;
    int curr;

    Stack(int size) {
        this.SIZE = size;
        this.stack = new int[this.SIZE];
        for (int i = 0; i < SIZE; i++) {
            stack[i] = -1;
        }
        curr = -1;
    }

    void push(int ele) {
        if (curr == SIZE - 1) {
            return;
        }

        curr++;
        stack[curr] = ele;
    }

    int pop() {
        if (curr == -1) {
            return Integer.MIN_VALUE;
        }

        int pop = stack[curr];
        stack[curr] = -1;
        curr--;
        return pop;
    }

    int peek() {
        return stack[curr];
    }

    boolean isEmpty() {
        return curr == -1;
    }

    boolean isFull() {
        return curr == SIZE - 1;
    }

    int size() {
        return curr + 1;
    }

    public static void main(String[] args) {
        Stack stack1 = new Stack(10);
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        System.out.println("Stack size: " + stack1.size());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println("Stack size: " + stack1.size());
        System.out.println(stack1.peek());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
        stack1.push(4);
        stack1.push(3);


        System.out.println("is Full " + stack1.isFull());
        for (int i = 0; i < 10; i++) {
            stack1.push(4);
        }
        System.out.println("is Full " + stack1.isFull());

        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
    }


}
