import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left, right;
        Node(int key) {
            data = key;
            left = right = null;
        }
    }
    public static boolean helper(Node root, int target,ArrayList<Integer> ans){
        if(root==null) return false;
        if(root.data==target) return true;
        boolean left=helper(root.left,target,ans);
        boolean right=helper(root.right,target,ans);
        if(left || right){
            ans.add(root.data);
            return true;
        }
        return false;
    }
    public static ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,target,ans);
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
        Node g=new Node(8);
        b.left=e;
        b.right=g;
        Node f=new Node(7);
        c.left=f;
        int target=7;
        System.out.println(Ancestors(root,target));
    }
}