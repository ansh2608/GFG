import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Binary_Tree_to_CDLL {
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    Node bTreeToClist(Node root) {
        if(root==null) return null;
        ArrayList<Integer> l=new ArrayList<>();
        inorder(root,l);
        Node head=new Node(l.get(0));
        Node temp=head;
        Node prev=head;
        for (int i=1;i<l.size();i++){
            temp.right=new Node(l.get(i));
            temp=temp.right;
            temp.left=prev;
            prev=temp;
        }
        prev.right=head;
        head.left=prev;
        return head;
    }
    void inorder(Node root, ArrayList<Integer> l){
        if (root!=null){
            inorder(root.left,l);
            l.add(root.data);
            inorder(root.right,l);
        }
    }

    static Node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }
    static void displayCList(Node head)
    {
        Node itr = head;
        do
        {
            System.out.print(itr.data + " ");
            itr = itr.right;
        } while (head!=itr);
        System.out.println();
        itr=itr.left;
        head = itr;
        do{
            System.out.print(itr.data + " ");
            itr=itr.left;
        }while(head!=itr);
        System.out.println();
    }
    public static void main(String[] args) {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s= br.readLine();
            Node root = buildTree(s);

            Solution boj = new Solution();
            Node head = boj.bTreeToClist(root);
            displayCList(head);

        }
    }
}
