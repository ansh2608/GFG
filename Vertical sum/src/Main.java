import java.util.*;

public class Main {
    public static class Node{
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static int min, max;
    public static Map<Integer, Integer> map;
    public static void traverse(Node root, int l){
        if(root == null) return;
        min = Math.min(min, l);
        max = Math.max(max, l);
        map.put(l, map.getOrDefault(l, 0) + root.data);
        traverse(root.left, l-1);
        traverse(root.right, l+1);
    }

    public static ArrayList <Integer> verticalSum(Node root) {
        min = 0;
        max = 0;
        map = new HashMap<>();
        traverse(root, 0);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=min; i<=max; i++) ans.add(map.get(i));
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        b.left=e;
        b.right=f;
        System.out.println(verticalSum(root));
    }
}