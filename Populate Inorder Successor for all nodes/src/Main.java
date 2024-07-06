import java.util.ArrayList;

public class Main {
    public static class Node {
        int data;
        Node left, right,next;

        public Node(int data){
            this.data = data;
        }
    }
    public static void getInorder(Node root, ArrayList<Node> inorder){
        if(root == null) return;
        getInorder(root.left, inorder);
        inorder.add(root);
        getInorder(root.right, inorder);
    }
    public static void populateNext(Node root) {
        ArrayList<Node> inorder = new ArrayList<>();
        getInorder(root, inorder);
        for(int i=0; i<inorder.size()-1; i++){
            int j = i;
            Node x = inorder.get(j);
            Node nextNode = inorder.get(j+1);
            x.next = nextNode;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(8);
        Node b=new Node(12);
        root.left=a;
        root.right=b;
        Node c=new Node(3);
        a.left=c;
        populateNext(root);
    }
}