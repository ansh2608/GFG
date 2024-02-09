public class Main {
    public static class Node{
        int data;
        Node left,right;
        Node(int key) {
            data = key;
            left = right = null;
        }
    }
    public static int isSumProperty(Node root){
        if (root==null) return 1;
        if (root.left == null && root.right == null) return 1;
        int leftSum = root.left != null ? root.left.data : 0;
        int rightSum = root.right != null ? root.right.data : 0;
        if (root.data == leftSum + rightSum && isSumProperty(root.left) != 0 && isSumProperty(root.right) != 0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Node root=new Node(35);
        Node a=new Node(20);
        Node b=new Node(15);
        root.left=a;
        root.right=b;
        Node c=new Node(15);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(10);
        Node f=new Node(5);
        b.left=e;
        b.right=f;
        System.out.println(isSumProperty(root));
    }
}