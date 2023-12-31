public class Largest_Substring {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for (int j=i+1;j<s.length();j++){
                if (ch==s.charAt(j)) {
                    int k=j-i-1;
                    max=Math.max(max,k);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "cbzxy";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
