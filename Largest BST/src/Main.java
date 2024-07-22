public class Main {
    public static class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
        }
    }
    static int countNodes(Node root){
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    static boolean isBST(Node root,int min,int max){
        if(root==null) return true;
        if(root.data<min || root.data>max) return false;
        return isBST(root.left,min,root.data-1) && isBST(root.right,root.data+1,max);
    }
    static int largestBst(Node root){
        if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) return countNodes(root);
        int left=largestBst(root.left);
        int right=largestBst(root.right);
        return Math.max(largestBst(root.left),largestBst(root.right));
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(4);
        Node b=new Node(4);
        root.left=a;
        root.right=b;
        Node c=new Node(6);
        Node d=new Node(8);
        a.left=c;
        a.right=d;
        System.out.println(largestBst(root));
    }
}