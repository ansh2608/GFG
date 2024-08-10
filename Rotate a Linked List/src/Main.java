public class Main {
    public static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public static Node rotate(Node head, int k) {
        int len=1;
        Node tail=head;
        while(tail.next!=null){
            len++;
            tail=tail.next;
        }
        if(k%len==0) return head;
        tail.next=head;
        Node temp=head;
        for(int i=1;i<k;i++) temp=temp.next;
        head=temp.next;
        temp.next=null;
        return head;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}