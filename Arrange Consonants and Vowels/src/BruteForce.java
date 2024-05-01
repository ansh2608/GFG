public class BruteForce {
    public static class Node {
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            next = null;
        }
    }
    public static Node arrangeCV(Node head){
        Node ans=new Node('$');
        Node res = ans,prev=null,temp=head;
        while (temp!=null){
            if(temp.data=='a' || temp.data=='e' || temp.data=='i' || temp.data=='o' || temp.data=='u'){
                ans.next=temp;
                ans=ans.next;
                if (prev==null){
                    head=head.next;
                    temp=head;
                }
                else {
                    prev.next=temp.next;
                    temp.next=null;
                    temp=prev.next;
                }
            }
            else {
                prev=temp;
                temp=temp.next;
            }
        }
        ans.next=head;
        return res.next;
    }
    public static void main(String[] args) {
        // a -> b -> c -> d -> e -> f -> g -> h -> i
        Node head=new Node('a');
        Node b=new Node('b');
        Node c=new Node('c');
        Node d=new Node('d');
        Node e=new Node('e');
        Node f=new Node('f');
        Node g=new Node('g');
        Node h=new Node('h');
        Node i=new Node('i');
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=h;
        h.next=i;
        Node ans=arrangeCV(head);
        while (ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}
