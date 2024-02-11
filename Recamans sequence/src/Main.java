import java.util.*;
public class Main {
    public static ArrayList<Integer> recamanSequence(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<n;i++){
            if (i==0){
                ans.add(0);
                mp.put(0,1);
            }
            else {
                int newVal= ans.get(i-1)-i;
                if (newVal<0 || mp.containsKey(newVal)){
                    newVal=ans.get(i-1)+i;
                    ans.add(newVal);
                }
                else {
                    ans.add(newVal);
                }
                mp.put(newVal,1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(recamanSequence(n));
    }
}