import java.util.*;

public class Main {
    public static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static long merge(int[] arr, int s, int mid, int e) {
        long[] temp = new long[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        long inversion = 0;
        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else {
                inversion += (mid - i + 1);
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= e) temp[k++] = arr[j++];
        for (int l = s; l <= e; l++) arr[l] = (int) temp[l - s];
        return inversion;
    }
    public static long mergeSort(int[] arr, int s, int e) {
        long inversion = 0;
        if (s < e) {
            int mid = s + (e - s) / 2;
            inversion += mergeSort(arr, s, mid);
            inversion += mergeSort(arr, mid + 1, e);
            inversion += merge(arr, s, mid, e);
        }
        return inversion;
    }
    public static int numberOfInversions(int[] a, int n) {
        return (int) mergeSort(a, 0, n - 1);
    }
    public static void inorder(Node root, ArrayList<Integer> nodes) {
        if (root == null) return;
        inorder(root.left, nodes);
        nodes.add(root.data);
        inorder(root.right, nodes);
    }
    public static int pairsViolatingBST(int n, Node root) {
        ArrayList<Integer> nodes = new ArrayList<>();
        inorder(root, nodes);
        return numberOfInversions(nodes.stream().mapToInt(i -> i).toArray(), n);
    }
    public static void main(String[] args) {
        int n=5;
        Node root=new Node(10);
        Node a=new Node(50);
        Node b=new Node(40);
        root.left=a;
        root.right=b;
        Node c=new Node(20);
        Node d=new Node(30);
        b.left=c;
        b.right=d;
        System.out.println(pairsViolatingBST(n,root));

    }
}