import java.util.*;
public class Main {
    public static class Node {
        int data;
        Node next;
        Node(int key) {
            data = key;
            next = null;
        }
    }
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) {
        HashSet<Integer> hs=new HashSet<>();
        int count=0;
        for(int i:head1)  hs.add(i);
        for(int i:head2) if(hs.contains(x-i)) count++;
        return count;
    }
    public static void main(String[] args) {
        Node head1=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node head2=new Node(11);
        Node x=new Node(12);
        Node y=new Node(13);
        System.out.println();
    }
}