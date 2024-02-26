import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recursion {
    public static void helper(String s,List<String> ans,String str,int pos){
        if (pos==s.length()) return;
        String curr=str;
        str+=s.charAt(pos);
        ans.add(str);
        helper(s,ans,str,pos+1);
        str=curr;
        helper(s,ans,str,pos+1);
    }
    public static List<String> AllPossibleStrings(String s) {
        List<String> ans = new ArrayList<>();
        helper(s,ans,"",0);
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(AllPossibleStrings(s));
    }
}
