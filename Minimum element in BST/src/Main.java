public class Main {
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
    public static int minValue(Node root) {
        int ans=root.data;
        if(root.left!=null)ans=minValue(root.left);
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        Node a=new Node(4);
        Node b=new Node(6);
        Node c=new Node(3);
        Node d=new Node(7);
        Node e=new Node(1);
        root.left=a;
        root.right=b;
        a.left=c;
        b.right=d;
        c.left=e;
        System.out.println(minValue(root));
    }
}