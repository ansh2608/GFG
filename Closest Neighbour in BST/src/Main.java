public class Main {
    public static class Node {
        int key;
        Node left, right;
        Node(int x) {
            key = x;
            left = right = null;
        }
    }
    public static int findMaxForN(Node root, int n) {
        int[] m=new int[1];
        m[0]=-1;
        func(root,n,m);
        return  m[0];
    }
    public static void func(Node root,int n,int[] m){
        if(root==null)return ;
        if((root.key<=n)) if(root.key>=m[0]) m[0]=root.key;
        func(root.left,n,m);
        func(root.right,n,m);
    }
    public static void main(String[] args) {
        Node root=new Node(5);
        Node a =new Node(2);
        Node b =new Node(12);
        root.left=a;
        root.right=b;
        Node c =new Node(1);
        Node d =new Node(3);
        a.left=c;
        a.right=d;
        Node e =new Node(9);
        Node f =new Node(21);
        b.left=e;
        b.right=f;
        Node g =new Node(19);
        Node h =new Node(25);
        f.left=g;
        f.right=h;
        int n=24;
        System.out.println(findMaxForN(root,n));
    }
}