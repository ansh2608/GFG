public class Merge_2_sorted_LL_in_reverse_order {
    public static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public static Node mergeResult(Node head1, Node head2) {
        Node dummyNode = new Node(0);
        Node tail = dummyNode;
        while(true) {
            if(head1 == null) {
                tail.next = head2;
                break;
            }
            if(head2 == null) {
                tail.next = head1;
                break;
            }
            if(head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            }
            else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        return reverse(dummyNode.next);
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(3);
        Node c=new Node(2);
        Node d=new Node(4);
        a.next=b;
        c.next=d;
        Node ans=mergeResult(a,c);
        while (ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}
