public class Main {
    static int moves;
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static int helper(Node root){
        if (root==null) return 0;
        int ln=helper(root.left);
        int rn=helper(root.right);
        moves+=Math.abs(ln)+Math.abs(rn);
        return root.data-1+ln+rn;
    }
    public static int distributeCandy(Node root) {
        moves=0;
        helper(root);
        return moves;
    }
    public static void main(String[] args) {
        Node root=new Node(0);
        root.left=new Node(3);
        root.right=new Node(0);
        System.out.println(distributeCandy(root));
    }
}