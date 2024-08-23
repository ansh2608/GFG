import java.util.ArrayList;

public class Main {
    public static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static void helper(Node root,ArrayList<Integer> ans,int lvl){
        if(root==null) return;
        if(lvl==ans.size()) ans.add(root.data);
        helper(root.left,ans,lvl+1);
        helper(root.right,ans,lvl+1);
    }
    public static ArrayList<Integer> leftView(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        helper(root,ans,0);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}