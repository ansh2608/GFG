public class Main {
    String reverseWords(String str) {
        String[] words = str.split("\\.");
        String output = words[0];
        for (int i = 1; i < words.length; i++) output = words[i] + "." + output;
        return output;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}