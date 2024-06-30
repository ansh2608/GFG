public class Main {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int x){
            data = x;
        }
    }
    public static Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) return head;
        Node current = head;
        if (x == 1) {
            head = head.next;
            if (head != null) head.prev = null;
            return head;
        }
        for (int i = 1; current != null && i < x; i++) current = current.next;
        if (current == null) return head;
        if (current.next != null) current.next.prev = current.prev;
        if (current.prev != null) current.prev.next = current.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node a=new Node(3);
        Node b=new Node(4);
        head.next=a;
        a.next=b;
        System.out.println(deleteNode(head,3));
    }
}