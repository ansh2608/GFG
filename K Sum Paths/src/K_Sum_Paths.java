import java.io.*;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
class GFG {
    static Node buildTree(String str) {
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length) {
            Node currNode = q.remove();
            String currVal = s[i];
            if(!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                q.add(currNode.left);
            }
            i++;
            if(i >= s.length) break;
            currVal = s[i];
            if(!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                q.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            int k = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();

            System.out.println(ob.sumK(root,k));
            t--;
        }
    }
}
class Solution
{
    public int sumK(Node root,int k){
        HashMap<Long, Long> preSum=new HashMap<>();
        preSum.put(0L, 1L);
        return solve(root, 0L, k, preSum)%(int)(1e9+7);
    }
    public int solve(Node root, long currSum, int k, HashMap<Long, Long> preSum){
        if(root==null) return 0;
        currSum+=root.data;
        long ans=preSum.getOrDefault(currSum-k, 0L);
        preSum.put(currSum, preSum.getOrDefault(currSum, 0L)+1);
        ans+=solve(root.left, currSum, k, preSum) + solve(root.right, currSum, k, preSum);
        preSum.put(currSum, preSum.get(currSum)-1);
        return (int)(ans%(1e9+7));
    }
}
