import java.util.ArrayList;
import java.util.List;

public class Main {
    public static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
        }
    }
    public Node flattenBST(Node root){
        if (root == null) return null;
        List<Node> nodes=new ArrayList<>();
        inOrderTraversal(root, nodes);
        for(int i=0;i<nodes.size()-1;i++){
            nodes.get(i).left=null;
            nodes.get(i).right=nodes.get(i+1);
        }
        nodes.get(nodes.size() - 1).left = null;
        nodes.get(nodes.size() - 1).right = null;
        return nodes.get(0);
    }
    public static void inOrderTraversal(Node node, List<Node> nodes){
        if(node==null) return;
        inOrderTraversal(node.left, nodes);
        nodes.add(node);
        inOrderTraversal(node.right, nodes);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}