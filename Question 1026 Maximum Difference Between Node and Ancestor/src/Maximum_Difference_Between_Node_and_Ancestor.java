public class Maximum_Difference_Between_Node_and_Ancestor {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) { this.val = val; }
    }
    public static int find(TreeNode root,int min,int max){
        if(root==null) return max-min;
        min=Math.min(root.val,min);
        max=Math.max(root.val,max);
        int r=find(root.right,min,max);
        int l=find(root.left,min,max);
        return Math.max(r,l);
    }
    public static int maxAncestorDiff(TreeNode root) {
        return find(root,root.val,root.val);
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(8);
        TreeNode a=new TreeNode(3);
        TreeNode b=new TreeNode(10);
        root.left=a;
        root.right=b;
        TreeNode c=new TreeNode(1);
        TreeNode d=new TreeNode(6);
        a.left=c;
        a.right=d;
        TreeNode e=new TreeNode(14);
        b.right=e;
        TreeNode f=new TreeNode(4);
        TreeNode g=new TreeNode(7);
        d.left=f;
        d.right=g;
        TreeNode h=new TreeNode(13);
        e.left=h;
        System.out.println(maxAncestorDiff(root));
    }
}
