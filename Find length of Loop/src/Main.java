public class Main {
    public static class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    public int countNodesinLoop(Node head) {
        Node p1=head;
        Node p2=head;

        while(p2 != null && p2.next != null){

            p1 =p1.next;
            p2 =p2.next.next;
            if(p1==p2){
                return helper(p1,p2);
            }
        }

        return 0;
    }
    private int helper(Node tnode,Node node){
        int s=0;
        while(true){
            tnode = tnode.next;
            s++;
            if(tnode==node){
                return s;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}