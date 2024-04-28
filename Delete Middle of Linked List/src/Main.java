public class Main {
    public static class Node {
        int data;
        Node next;
        Node(int d)  {
            data = d;
            next = null;
        }
    }
    public static Node deleteMid(Node head) {
        if (head == null || head.next == null) return null;
        Node prev = head;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;
        return head;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}