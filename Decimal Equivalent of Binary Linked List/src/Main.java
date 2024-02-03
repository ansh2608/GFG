class Node {
    int data;
    Node next;
    Node(int d)  {
        data = d;  next = null;
    }
}
public class Main {
    static long DecimalValue(Node head) {
        if (head==null) return 0;
        Node temp=head;
        long ans=0;
        while (temp!=null){
            ans=(ans*2+ temp.data)%((long)1e9+7);
            temp=temp.next;
        }
        return ans;
    }
    public static void main(String[] args) {
        Node head=new Node(0);
        Node a=new Node(1);
        Node b=new Node(1);
        head.next=a;
        a.next=b;
        System.out.println(DecimalValue(head));
    }
}