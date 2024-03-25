import java.util.*;

public class Main {
    public static ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans = new ArrayList<>();
        solve(N, ans, "", 0, 0);
        return ans;
    }
    public static void solve(int n, ArrayList<String> arr, String temp, int countZ, int countO){
        if(n == 0){
            arr.add(temp);
            return;
        }
        if(countO >= countZ)    solve(n - 1, arr, temp + "1", countZ, countO + 1);
        if(countO > countZ)     solve(n - 1, arr, temp + "0", countZ + 1, countO);
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(NBitBinary(n));
    }
}