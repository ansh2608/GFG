public class Main {
    public static boolean kPangram(String str, int k) {
        int count = 0;
        int[] freq = new int[26];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ') continue;
            count++;
            freq[str.charAt(i)-97]++;
        }
        if(count<26) return false;
        int i;
        for(i=0;i<26;i++){
            if(freq[i]>0) continue;
            else k--;
        }
        if(i==26 && k>=0) return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "the quick brown fox jumps over the lazy dog";
        int k = 0;
        System.out.println(kPangram(str,k));
    }
}