import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static ArrayList<Integer> helpsibling(Node root , ArrayList<Integer> ans){
        if(root==null) return ans;
        else if(root.left!=null && root.right!=null){
            helpsibling(root.left, ans);
            helpsibling(root.right,ans);
        }
        else if(root.left!=null){
            ans.add(root.left.data);
            helpsibling(root.left, ans);
        }
        else if(root.right!=null){
            ans.add(root.right.data);
            helpsibling(root.right,ans);
        }
        return ans;
    }
    public static ArrayList<Integer> noSibling(Node root) {
        ArrayList<Integer>ans= new ArrayList<>();
        helpsibling(root, ans);
        if(ans.size()==0){
            ans.add(-1);
            return ans;
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Node root=new Node(37);
        Node a=new Node(20);
        Node b=new Node(113);
        root.left=a;
        root.right=b;
        System.out.println(noSibling(root));
    }
}