import java.util.*;
public class BST_contains_Dead_End {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();

        inorder(root,l,in);

        for(int i: l){
            if(i==1 && in.contains(2)) return true;
            if(in.contains(i-1)&&in.contains(i+1)) return true;
        }
        return false;
    }
    public static void inorder(Node root, ArrayList<Integer> l, ArrayList<Integer> in){
        if(root==null) return;
        inorder(root.left,l,in);
        if(root.left==null && root.right==null) l.add(root.data);
        in.add(root.data);
        inorder(root.right,l,in);
    }
    public static void main(String[] args) {

    }
}
