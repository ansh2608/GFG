public class Main {
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    boolean solve(Node root ,int mini , int maxi){
        if(root==null) return true;
        if(root.data >= maxi || root.data<=mini) return false;
        return solve(root.left, mini, root.data) && solve(root.right, root.data, maxi);
    }
    boolean isBST(Node root) {
        return solve(root , Integer.MIN_VALUE , Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}