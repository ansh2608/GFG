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
        TrieNode node=root;
        for(int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if(node.children[index]==null) node.children[index]=new TrieNode();
            node=node.children[index];
        }
        node.isEndOfWord=true;
    }
    static boolean search(TrieNode root, String key){
        TrieNode node=root;
        for (int i=0;i<key.length();i++){
            int index=key.charAt(i)-'a';
            if (node.children[index]==null) return false;
            node=node.children[index];
        }
        return node.isEndOfWord;
    }
    public static void main(String[] args) {

    }
}