public class Main {
    public static class Node {
        Node next;
        int data;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static Node delete(Node head, int k){
        if (k==1) return null;
        int a=1;
        Node prev=head,curr=head;
        while (curr!=null){
            if (a==k){
                a=1;
                prev.next=curr.next;
            }
            else {
                prev=curr;
                a++;
            }
            curr=curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        Node g=new Node(8);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        int k=2;
        Node ans=delete(head,k);
        while (ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}