import java.util.*;

public class Main {
    public static String findOrder(String[] dict, int N, int K) {
        List<Set<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < K; i++) adjList.add(new HashSet<>());
        int[] inDegree = new int[K];
        for (int i = 0; i < N - 1; i++) {
            String word1 = dict[i];
            String word2 = dict[i + 1];
            int minLength = Math.min(word1.length(), word2.length());
            boolean foundDifference = false;
            for (int j = 0; j < minLength; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    int u = word1.charAt(j) - 'a';
                    int v = word2.charAt(j) - 'a';
                    if (!adjList.get(u).contains(v)) {
                        adjList.get(u).add(v);
                        inDegree[v]++;
                    }
                    foundDifference = true;
                    break;
                }
            }
            if (!foundDifference && word1.length() > word2.length()) return "";
        }
        Queue<Integer> zeroInDegreeQueue = new LinkedList<>();
        for (int i = 0; i < K; i++) {
            if (inDegree[i] == 0) zeroInDegreeQueue.add(i);
        }
        StringBuilder order = new StringBuilder();
        while (!zeroInDegreeQueue.isEmpty()) {
            int u = zeroInDegreeQueue.poll();
            order.append((char)(u + 'a'));
            for (int v : adjList.get(u)) {
                inDegree[v]--;
                if (inDegree[v] == 0) zeroInDegreeQueue.add(v);
            }
        }
        if (order.length() < K) return "";
        return order.toString();
    }
    public static void main(String[] args) {
        int n = 5, k = 4;
        String[] dict = {"baa","abcd","abca","cab","cad"};
        System.out.println(findOrder(dict,n,k));
    }
}