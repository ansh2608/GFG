import java.util.*;
public class Check {
    static int kSubstrConcat(int n, String s, int k) {
        if(n%k!=0) return 0;
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n; i+=k){
            for(int j = i; j<i+k; j++) sb.append(s.charAt(j));
            map.put(sb.toString(), map.getOrDefault(sb.toString(),0)+1);
            sb.setLength(0);
        }
        if(map.size()<=2) return 1;
        return 0;
    }
    public static void main(String[] args) {
        int N = 4,K = 2;
        String S = "bdac";
        System.out.println(kSubstrConcat(N,S,K));
    }
}
