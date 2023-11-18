public class Reverse {
    class Node
    {
        int data;
        Node next, prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node reverseDLL(Node  head)
    {
        //Your code here
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }

        return prev;
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(9);
        Node c=new Node(4);
        a.next=b;
        b.next=c;
    }
}
