import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void permutations(ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans,boolean[] bool,ArrayList<Integer> curr){
        if (curr.size()==arr.size()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i=0;i<arr.size();i++){
            if (bool[i] || i>0 && arr.get(i).equals(arr.get(i-1)) && !bool[i-1]) continue;
            bool[i]=true;
            curr.add(arr.get(i));
            permutations(arr,ans,bool,curr);
            bool[i]=false;
            curr.remove(curr.size()-1);
        }
    }
    public static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        boolean[] bool=new boolean[n];
        ArrayList<Integer> curr=new ArrayList<>();
        permutations(arr,ans,bool,curr);
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        ArrayList<ArrayList<Integer>> ans=uniquePerms(arr,n);
        System.out.println(ans);
    }
}