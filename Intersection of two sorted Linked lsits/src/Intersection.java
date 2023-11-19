import java.util.*;
public class Intersection {
    class Node {
        int data;
        Node next;
        Node(int d)  { data = d;  next = null; }
    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node head=new Node(-1);
        Node t=head;
        while(head1!=null && head2!=null) {
            if(head1.data==head2.data) {
                Node temp=new Node(head1.data);
                t.next=temp;
                t=t.next;

                head1=head1.next;
                head2=head2.next;
            }
            else if(head1.data < head2.data) {
                head1=head1.next;
            }
            else {
                head2=head2.next;
            }
        }
        return head.next;
    }
    public static void main(String[] args) {

    }
}
