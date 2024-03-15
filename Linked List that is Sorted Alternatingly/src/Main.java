public class Main {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node sort(Node head){
        Node h1 = new Node(-1);
        Node h2 = new Node(-1);

        Node ch1 = h1;
        Node ch2 = h2;
        Node curr = head;

        while(curr != null){
            ch1.next = curr;
            ch1 = ch1.next;
            curr = curr.next;

            if(curr!= null){
                ch2.next = curr;
                ch2 = ch2.next;
                curr = curr.next;
            }

            ch1.next = null;
            ch2.next = null;
        }

        h1 = h1.next;
        h2 = h2.next;
        h2 = reverseList(h2);
        return merge(h1,h2);
    }

    public static Node merge(Node r1, Node r2){
        Node dummy = new Node(0);
        Node current = dummy;

        while(r1 != null && r2 != null){
            if(r1.data < r2.data){
                current.next = r1;
                r1 = r1.next;
            }
            else{
                current.next = r2;
                r2 = r2.next;
            }

            current = current.next;
        }
        if(r1 != null){
            current.next = r1;
        }else{
            current.next = r2;
        }
        return dummy.next;
    }

    public static Node reverseList(Node head){
        Node current = head;
        Node prev = null;
        Node next;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=new Node(1);
        Node a=new Node(9);
        Node b=new Node(2);
        Node c=new Node(8);
        Node d=new Node(3);
        Node e=new Node(7);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node ans=sort(head);
        while (ans!=null){
            System.out.print(ans.data+" ");
            ans=ans.next;
        }
    }
}