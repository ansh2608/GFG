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
    public ArrayList<Integer> serialize(Node root) {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(root.data);
        while (!q.isEmpty()){
            Node curr=q.poll();
            if (curr.left!=null){
                q.add(curr.left);
                ans.add(curr.left.data);
            }
            else ans.add(-1);
            if (curr.right!=null){
                q.add(curr.right);
                ans.add(curr.right.data);
            }
            else ans.add(-1);
        }
        return ans;
    }
    public Node deSerialize(ArrayList<Integer> A) {
        Node ans=new Node(A.getFirst());
        Node head=ans;
        Queue<Node> q=new LinkedList<>();
        q.add(ans);
        int idx=1;
        while (!q.isEmpty()){
            Node curr=q.poll();
            if (A.get(idx)!=-1){
                curr.left=new Node(A.get(idx));
                q.add(curr.left);
            }
            idx++;
            if(A.get(idx)!=-1){
                curr.right=new Node(A.get(idx));
                q.add(curr.right);
            }
            idx++;
        }
        return head;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(2);
        root.left=a;
        root.right=b;
        System.out.println();
    }
}