public class Main {
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean areIdentical(Node head1, Node head2) {
        Node temp1=head1,temp2=head2;
        while(temp1!=null && temp2!=null){
            if(temp1.data != temp2.data) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null || temp2!=null) return false;
        return true;
    }
    public static void main(String[] args) {
        Node head1=new Node(1);
        Node a1=new Node(2);
        Node b1=new Node(3);
        Node c1=new Node(4);
        head1.next=a1;
        a1.next=b1;
        b1.next=c1;
        Node head2=new Node(1);
        Node a2=new Node(2);
        Node b2=new Node(3);
        Node c2=new Node(4);
        Node d2=new Node(5);
        head2.next=a2;
        a2.next=b2;
        b2.next=c2;
        c2.next=d2;
        System.out.println(areIdentical(head1,head2));
    }
}