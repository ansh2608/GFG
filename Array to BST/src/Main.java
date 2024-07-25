public class Main {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public Node sortedArrayToBST(int[] nums) {
        return solve(0 , nums.length - 1 , nums);
    }
    public Node solve(int l , int r , int[] nums) {
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        Node root = new Node(nums[mid]);
        root.left = solve(l, mid - 1, nums);
        root.right = solve(mid + 1, r, nums);
        return root;
    }
        public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Hello world!");
    }
}