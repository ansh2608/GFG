import java.util.*;

public class Optimise {
    public static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    ArrayList<Integer> a = new ArrayList<>();
    public ArrayList<Integer> serialize(Node root) {
        if(root == null) {
            a.add(-1);
            return a;
        }
        a.add(root.data);
        a = serialize(root.left);
        a = serialize(root.right);

        return a;
    }
    int idx = -1;
    public Node deSerialize(ArrayList<Integer> A) {
        idx++;
        if(A.get(idx) == -1) return null;
        Node root = new Node(A.get(idx));
        root.left = deSerialize(A);
        root.right = deSerialize(A);
        return root;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(2);
        root.left=a;
        root.right=b;
        System.out.println();
    }
}
