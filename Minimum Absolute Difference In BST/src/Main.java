public class Main {
    class Node{
        int data;
        Node left;
        Node right;
    }
    int previous, difference;
    int absolute_diff(Node root) {
        previous=Integer.MIN_VALUE;
        difference=Integer.MAX_VALUE;
        findMinDiff(root);
        return difference;
    }
    void findMinDiff(Node root){
        if(root==null) return;
        findMinDiff(root.left);
        if(previous!=Integer.MIN_VALUE && Math.abs(previous-root.data)<difference) difference=Math.abs(previous-root.data);
        previous=root.data;
        findMinDiff(root.right);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}