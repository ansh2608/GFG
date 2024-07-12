public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
        }
    }
    public static boolean hasPathSum(Node root, int target) {
        if(root==null) return false;
        if(root.left==null && root.right==null) return target==root.data;
        boolean l=hasPathSum(root.left,target-root.data);
        boolean r=hasPathSum(root.right,target-root.data);
        return l||r;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}