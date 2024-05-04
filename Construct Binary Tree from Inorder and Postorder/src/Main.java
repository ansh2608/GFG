import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int value) {
            data = value;
            left = null;
            right = null;
        }
    }
    public static int preIndex;
    public static HashMap<Integer,Integer> h=new HashMap<>();
    public static Node buildTree(int[] in, int[] post, int n) {
        for(int i=0;i<in.length;i++) h.put(in[i],i);
        preIndex=n-1;
        return cTree(in,post,0,n-1);
    }
    public static Node cTree(int[] in,int[] pre,int is,int ie){
        if(is>ie)return null;
        Node root=new Node(pre[preIndex--]);
        int inIndex=is;
        inIndex= h.get(root.data);
        root.right=cTree(in, pre, inIndex+1, ie);
        root.left=cTree(in, pre, is, inIndex-1);
        return root;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] in = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] post = {8, 4, 5, 2, 6, 7, 3, 1};
        Node ans=buildTree(in,post,n);
    }
}