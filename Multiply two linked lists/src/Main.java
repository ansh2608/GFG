public class Main {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data=data;
            this.next = null;
        }
    }
    private final long MOD = 1000000007;

    public long multiplyTwoLists(Node first, Node second) {
        long num1 = nodeToNum(first);
        long num2 = nodeToNum(second);
        return (num1 * num2) % MOD;
    }

    public long nodeToNum(Node node) {
        long num = 0;
        while (node != null) {
            num = (num * 10 + node.data) % MOD; // Calculate modulo at each step
            node = node.next;
        }
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}