public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static int sumOfLeafNodes(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return root.data;
        int leftAns=sumOfLeafNodes(root.left);
        int rightAns=sumOfLeafNodes(root.right);
        return leftAns+rightAns;
    }
    public static void main(String[] args) {
        Node root=new Node(67);
        Node a=new Node(34);
        Node b=new Node(82);
        root.left=a;
        root.right=b;
        Node c=new Node(12);
        Node d=new Node(45);
        a.left=c;
        a.right=d;
        Node e=new Node(78);
        b.left=e;
        System.out.println(sumOfLeafNodes(root));
    }
}