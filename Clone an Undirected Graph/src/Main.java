import java.util.*;
public class Main {
    public static class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }
        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }
        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }
    public static Node cloneGraph(Node node){
        HashMap<Integer, Node> hm = new HashMap();
        Queue<Node> q = new LinkedList();
        q.add(node);
        hm.put(node.val, new Node(node.val, new ArrayList()));

        while(!q.isEmpty()){
            Node cur = q.remove();
            ArrayList<Node> clonedNbrs = hm.get(cur.val).neighbors;

            for(Node n : cur.neighbors){
                if( !hm.containsKey(n.val)){
                    q.add(n);
                    hm.put(n.val,  new Node(n.val, new ArrayList()));
                }
                clonedNbrs.add(hm.get(n.val));
            }
        }
        return hm.get(node.val);
    }
    public static void main(String[] args) {
        ArrayList<Integer>[] adjList = new ArrayList[4];
        for (int i = 0; i < 4; i++) adjList[i] = new ArrayList<>();
        adjList[0].add(1);
        adjList[0].add(3);
        adjList[1].add(0);
        adjList[1].add(2);
        adjList[2].add(1);
        adjList[2].add(3);
        adjList[3].add(0);
        adjList[3].add(2);
        Node[] nodes = new Node[4];
        for (int i = 0; i < 4; i++) nodes[i] = new Node(i);
        for (int i = 0; i < 4; i++) {
            for (int neighbor : adjList[i]) {
                nodes[i].neighbors.add(nodes[neighbor]);
            }
        }
        Node clonedGraph = cloneGraph(nodes[0]);
    }
}