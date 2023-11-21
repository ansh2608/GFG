public class Determine_Identical {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    boolean check(Node root1, Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null && root2!=null || root2==null && root1!=null) return false;
        if(root1.data!=root2.data) return false;
        return check(root1.left,root2.left) && check(root1.right,root2.right);
    }
    boolean isIdentical(Node root1, Node root2)
    {
        return check(root1,root2);
    }

    public static void main(String[] args) {

    }
}
