import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static class Node {
         int data;
         Node left, right;

         public Node(int d) {
             data = d;
             left = right = null;
         }
    }
    public static boolean isKDistance(Node root,int k){
        if (root==null) return false;
        if (root.left==null && root.right==null && k==0) return true;
        if (root.left==null && root.right==null || k<=0) return false;
        boolean left=isKDistance(root.left,k-1);
        boolean right=isKDistance(root.right,k-1);
        return left || right;
    }
    public static int printKDistantfromLeaf(Node root, int k) {
        if (root==null) return 0;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int count=0;
        while (!q.isEmpty()){
            int size= q.size();
            while (size-->0){
                Node curr=q.remove();
                if (isKDistance(curr,k)) count++;
                if (curr.left!=null) q.add(curr.left);
                if (curr.right!=null) q.add(curr.right);
            }
        }
        return count;
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
        Node g=new Node(8);
        e.right=g;
        int k=2;
        System.out.println(printKDistantfromLeaf(root,k));
    }
}