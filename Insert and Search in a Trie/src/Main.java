
public class Main {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord;

        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < 26; i++) children[i] = null;
        }
    }
    static void insert(TrieNode root, String key) {
        TrieNode node  = root;
        for(char c : key.toCharArray()){
            if(node.children[c-'a']==null) node.children[c-'a'] = new TrieNode();
            node = node.children[c-'a'];
        }
        node.isEndOfWord = true;
    }
    static boolean search(TrieNode root, String key) {
        TrieNode node = root;
        for(char c : key.toCharArray()){
            if(node.children[c-'a']==null) return false;
            node = node.children[c-'a'];
        }
        return node.isEndOfWord;
    }
    public static void main(String[] args) {
        TrieNode[] list = {"the", "a", "there", answer, any, by, bye, their}
        String key = "the";
    }
}