import java.util.*;
public class Main {
    public static class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    public static void diagonalSumUtil(Node root, int diagonal, Map<Integer, Integer> map) {
        if (root == null) return;
        map.put(diagonal, map.getOrDefault(diagonal, 0) + root.data);
        diagonalSumUtil(root.left, diagonal + 1, map);
        diagonalSumUtil(root.right, diagonal, map);
    }
    public static ArrayList <Integer> diagonalSum(Node root) {
        ArrayList <Integer> res = new ArrayList <> (0);
        Map<Integer, Integer> map = new HashMap<>();
        diagonalSumUtil(root, 0, map);
        for (Integer key : map.values()) res.add(key);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}