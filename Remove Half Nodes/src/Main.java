public class Main {
    public static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static Node helper(Node root){
        if(root==null) return root;
        root.left=helper(root.left);
        root.right=helper(root.right);
        if(root.left==null && root.right==null) return root;
        else if (root.left==null) return root=root.right;
        else if (root.right==null) return root=root.left;
        return root;
    }
    public Node RemoveHalfNodes(Node root) {
        return helper(root);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}