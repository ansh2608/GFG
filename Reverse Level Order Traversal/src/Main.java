import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left, right;
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            stack.push(tempNode.data);

            // Enqueue right child
            if (tempNode.right != null)
                queue.add(tempNode.right);

            // Enqueue left child
            if (tempNode.left != null)
                queue.add(tempNode.left);
        }

        // Pop elements from stack and add to result list
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}