class Node {
    int data;
    Node next;
    Node(int d) { data = d; }
}

public class JoshephusTrapUsingCircularLinkedList{
    public static void main(String[] args) {
        int n = 7, k = 3;
        System.out.println("Safe position: " + josephus(n, k));
    }

    static int josephus(int n, int k) {
        // Create circular linked list
        Node head = new Node(1), curr = head;
        for (int i = 2; i <= n; i++) {
            curr.next = new Node(i);
            curr = curr.next;
        }
        curr.next = head;

        // Eliminate every k-th node
        while (curr.next != curr) {
            for (int i = 1; i < k - 1; i++)
                curr = curr.next;
            curr.next = curr.next.next; // Remove k-th node
            curr = curr.next;
        }
        return curr.data;
    }
}
