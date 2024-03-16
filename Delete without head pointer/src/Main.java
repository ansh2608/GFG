public class Main {
    public static class Node {
        int data ;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static void deleteNode(Node del_node) {
        del_node.data= del_node.next.data;
        del_node.next=del_node.next.next;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node a=new Node(20);
        Node b=new Node(4);
        Node c=new Node(30);
        head.next=a;
        a.next=b;
        b.next=c;
        deleteNode(a);
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}