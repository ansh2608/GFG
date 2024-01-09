import java.util.ArrayList;

public class Search_Pattern {
    public static ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        while (true){
            int idx=txt.indexOf(pat,i);
            if (idx==-1) break;
            else {
                ans.add(idx+1);
                i=idx+1;
            }
        }
        if (ans.isEmpty()) ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "geek";
        ArrayList<Integer> ans=search(pat,txt);
        System.out.println(ans);
    }
}
