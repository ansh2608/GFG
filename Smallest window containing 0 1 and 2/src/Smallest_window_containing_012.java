import java.util.*;
public class Smallest_window_containing_012 {
    public static int smallestSubstring(String S) {
        int[] a = new int[3];
        int j = 0, ans = Integer.MAX_VALUE, cnt = 0;
        int n = S.length();
        for (int i = 0; i < n; i++) {
            if (a[S.charAt(i) - '0'] == 0) cnt++;
            a[S.charAt(i) - '0']++;
            while (cnt == 3) {
                ans = Math.min(ans, i - j + 1);
                a[S.charAt(j) - '0']--;
                if (a[S.charAt(j) - '0'] == 0) cnt--;
                j++;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
    public static void main(String[] args) {
        String s="01212";
        System.out.println(smallestSubstring(s));
    }
}
