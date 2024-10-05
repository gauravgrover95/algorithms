/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Queue {
    int SIZE;
    int[] queue;
    int curr;

    Queue(int size) {
        this.SIZE = size;
        this.queue = new int[this.SIZE];
        for (int i = 0; i < SIZE; i++) {
            queue[i] = -1;
        }
        curr = -1;
    }

    void enqueue(int ele) {
        if (curr == SIZE - 1) {
            return;
        }

        curr++;
        queue[curr] = ele;
    }

    int dequeue() {
        if (curr == -1) {
            return Integer.MIN_VALUE;
        }

        int pop = queue[curr];
        queue[curr] = -1;
        curr--;
        return pop;
    }

    int peek() {
        return queue[curr];
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

    }
}
