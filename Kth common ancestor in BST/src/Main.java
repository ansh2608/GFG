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
    public static void level(Node root,int x,int y,ArrayList<Integer> a) {
        if(root==null) return;
        a.add(root.data);
        if(x<root.data && y<root.data) level(root.left,x,y,a);
        if(x>root.data && y>root.data) level(root.right,x,y,a);
    }
    public static int kthCommonAncestor(Node root, int k, int x, int y) {
        ArrayList<Integer> a=new ArrayList<>();
        level(root,x,y,a);
        return(a.size()-k>=0)?a.get(a.size()-k):-1;
    }
    public static void main(String[] args) {
        Node root=new Node(30);
        Node a=new Node(20);
        Node b=new Node(50);
        root.left=a;
        root.right=b;
        Node c=new Node(40);
        Node d=new Node(60);
        b.left=c;
        b.right=d;
        int k = 2, x = 40, y = 60;
        System.out.println(kthCommonAncestor(root,k,x,y));
    }
}