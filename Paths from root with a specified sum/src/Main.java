import java.util.ArrayList;
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class Main {
    public static void helper(Node root,int sum ,ArrayList<ArrayList<Integer>> list,ArrayList<Integer> ans){
        if(root == null)return;
        ans.add(root.data);
        int fin =0;
        for(int i = ans.size()-1 ; i >= 0 ; i--) fin += ans.get(i);
        if(fin == sum)list.add(new ArrayList<>(ans));
        helper(root.left,sum,list,ans);
        helper(root.right,sum,list,ans);
        ans.remove(ans.size()-1);
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>>list = new ArrayList<>();
        helper(root,sum,list,new ArrayList<>());
        return list;
    }
    public static void main(String[] args) {
        int sum=8;
        Node root=new Node(1);
        Node a=new Node(20);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(15);
        b.left=c;
        b.right=d;
        Node e=new Node(6);
        Node f=new Node(7);
        c.left=e;
        c.right=f;
        Node g=new Node(8);
        Node h=new Node(9);
        d.left=g;
        d.right=h;
        ArrayList<ArrayList<Integer>> ans=printPaths(root,sum);
        System.out.println(ans);
    }
}