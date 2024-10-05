/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static void printLL(Node root) {
        while (root != null) {
            System.out.print(root.data + " ");
            root = root.next;
        }
        System.out.println();
        System.out.println();
    }

    static Node insertAtBeginning(Node root, int data) {
        Node beg = new Node(data);
        beg.next = root;
        root = beg;
        return root;
    }

    static Node insertAfter(Node root, int key, int data) {
        if (root == null) {
            return root;
        }

        Node curr = root;

        while (curr != null) {
            if (curr.data == key) {
                break;
            }
            curr = curr.next;
        }

        if (curr == null) {
            return root;
        }

        Node newNode = new Node(data);

        newNode.next = curr.next;
        curr.next = newNode;

        return root;

    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.next = new Node(10);
        root.next.next = new Node(15);
        root.next.next.next = new Node(25);

        System.out.println("Linked List: ");
        printLL(root);
        root = insertAtBeginning(root, 2);

        System.out.println("Linked List after beginning insertion: ");
        printLL(root);

        int key = 10, newData = 7;
        root = insertAfter(root, key, newData);

        System.out.println("Linked List after key insertion: ");
        printLL(root);
    }
}
