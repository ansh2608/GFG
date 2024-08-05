import java.util.*;

public class Main {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public static ArrayList<Integer> bottomView(Node root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair cur = q.remove();
            map.put(cur.hd,cur.node.data);
            if(cur.node.left!=null) q.add(new Pair(cur.node.left,cur.hd-1));
            if(cur.node.right!=null) q.add(new Pair(cur.node.right,cur.hd+1));
        }
        ArrayList<Integer> list =new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) list.add(entry.getValue());
        return list;
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(20);
        Node b=new Node(30);
        root.left=a;
        root.right=b;
        Node c=new Node(40);
        Node d=new Node(60);
        a.left=c;
        a.right=d;
        System.out.println(bottomView(root));
    }
}