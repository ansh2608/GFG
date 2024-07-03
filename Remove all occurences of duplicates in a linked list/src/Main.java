import java.util.*;

public class Main {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public Node removeAllDuplicates(Node head) {
        HashMap<Integer,Integer> hm=new LinkedHashMap<>();
        Node temp=head;
        while(temp!=null){
            if(hm.containsKey(temp.data)) hm.put(temp.data,hm.get(temp.data)+1);
            else hm.put(temp.data,1);
            temp=temp.next;
        }
        Node dummy=new Node(-1);
        Node res=dummy;
        for(Map.Entry<Integer,Integer> mp: hm.entrySet()){
            if(mp.getValue()==1){
                dummy.next=new Node(mp.getKey());
                dummy=dummy.next;
            }
        }
        return res.next;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}