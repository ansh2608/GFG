public class Main {
    public static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public static Node insertionSort(Node head) {
        if(head == null || head.next == null)return head;
        Node temp = head;
        Node cur = head.next;
        while(cur != null){
            while(temp != cur){
                if(temp.data> cur.data){
                    int d = temp.data;
                    temp.data = cur.data;
                    cur.data = d;
                }
                temp = temp.next;

            }
            temp = head;
            cur = cur.next;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node a=new Node(30);
        Node b=new Node(23);
        Node c=new Node(28);
        Node d=new Node(30);
        Node e=new Node(11);
        Node f=new Node(14);
        Node g=new Node(19);
        Node h=new Node(16);
        Node i=new Node(21);
        Node j=new Node(25);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        i.next=j;
        Node ans=insertionSort(a);
        while (ans!=null) {
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}