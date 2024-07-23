import java.util.*;
public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> al = new ArrayList<>();
        preorder(al,root1);
        preorder(al,root2);
        Collections.sort(al);
        return al;
    }
    private void preorder(List<Integer> al,Node root){
        if(root==null) return;
        al.add(root.data);
        preorder(al,root.left);
        preorder(al,root.right);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}