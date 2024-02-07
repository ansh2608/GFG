public class Main {
    public static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static Node lowestCommonAncestor(Node root,int a,int b){
        if (root==null || root.data==a || root.data==b) return root;
        Node left=lowestCommonAncestor(root.left,a,b);
        Node right=lowestCommonAncestor(root.right,a,b);
        if (left!=null && right!=null) return root;
        return left != null ? left : right;
    }
    public static int distanceFromRoot(Node root,int n){
        if (root==null) return -1;
        if (root.data==n) return 0;
        int left=distanceFromRoot(root.left,n);
        int right=distanceFromRoot(root.right,n);
        if (left!=-1) return left+1;
        if (right!=-1) return right+1;
        return -1;
    }
    public static int findDist(Node root, int a, int b) {
        Node lca=lowestCommonAncestor(root,a,b);
        int distA=distanceFromRoot(lca,a);
        int distB=distanceFromRoot(lca,b);
        return distA+distB;
    }
    public static void main(String[] args) {
        Node root=new Node(11);
        Node a=new Node(22);
        Node b=new Node(33);
        root.left=a;
        root.right=b;
        Node c=new Node(44);
        Node d=new Node(55);
        a.left=c;
        a.right=d;
        Node e=new Node(66);
        Node f=new Node(77);
        b.left=e;
        b.right=f;
        int p=77,q=22;
        System.out.println(findDist(root,p,q));
    }
}