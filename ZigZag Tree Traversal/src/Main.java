import java.util.*;

public class Main {
    public static class Node
    {
        int data;
        Node left,right;
        Node(int d)
        {
            data=d;
            left=right=null;
        }
    }
    public static ArrayList<Integer> zigZagTraversal(Node root)
    {
        Deque<Node> q=new LinkedList<>();
        ArrayList<Integer> res=new ArrayList<>();
        int count=0;
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<s;i++){
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                l.add(q.poll().data);
            }
            int size=l.size()-1;
            for(int i=0;i<=size;i++){
                if(count%2==0)
                    res.add(l.get(i));
                else
                    res.add(l.get(size-i));
            }
            count++;

        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}