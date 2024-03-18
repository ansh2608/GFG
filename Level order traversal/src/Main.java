import java.util.*;

public class Main {
    public static class Node
    {
        int data;
        Node left, right;

        Node(int item)
        {
            data = item;
            left = right = null;
        }
    }
    static ArrayList<Integer> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node r = q.remove();
            list.add(r.data);
            if(r.left != null) q.add(r.left);
            if(r.right != null) q.add(r.right);
        }
        return list;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(3);
        Node b=new Node(2);
        root.left=a;
        root.right=b;
    }
}