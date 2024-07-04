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
    private static String serialize(Node root, Map<String, Integer> map, List<Node> res) {
        if (root == null) return "#";
        String serial = root.data + "," + serialize(root.left, map, res) + "," + serialize(root.right, map, res);
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        if (map.get(serial) == 2) res.add(root);
        return serial;
    }

    public static List<Node> printAllDups(Node root) {
        List<Node> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        serialize(root, map, res);
        return res;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        a.left=c;
        Node d=new Node(2);
        Node e=new Node(4);
        b.left=d;
        b.right=e;
        Node f=new Node(4);
        d.left=f;
        System.out.println(printAllDups(root));
    }
}