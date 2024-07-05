import java.util.HashSet;

public class Main {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public int verticalWidth(Node root) {
        HashSet<Integer> set = new HashSet<>();
        helper(root, 0, set);
        return set.size();
    }

    public void helper(Node root, int index, HashSet<Integer> set){
        if(root==null) return;
        set.add(index);
        helper(root.left, index-1, set);
        helper(root.right, index+1, set);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}