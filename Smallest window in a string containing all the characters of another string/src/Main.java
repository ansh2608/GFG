import java.util.HashMap;

public class Main {
    public static String smallestWindow(String s, String t) {
        if(s.length() < t.length()) return "-1";
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i <= t.length()-1;i++) map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        int i = 0, j = 0;
        int minlen = Integer.MAX_VALUE;
        int si = -1;
        int count = t.length();
        while(j < n){
            char c1 = s.charAt(j);
            if(map.containsKey(c1)){
                if(map.get(s.charAt(j)) > 0) count--;
                map.put(c1,map.get(c1)-1);
            }
            while(count == 0){
                char c2 = s.charAt(i);
                int length = j-i+1;
                if(length < minlen){
                    minlen = length;
                    si = i;
                }
                if(map.containsKey(c2)){
                    map.put(c2,map.get(c2)+1);
                    if(map.get(c2) > 0) count++;
                }
                i++;
            }
            j++;
        }
        return minlen == Integer.MAX_VALUE ? "-1":s.substring(si,si+minlen);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}