import java.util.*;
public class FindtheString {
    static String findString(int n, int k){
        StringBuilder cur=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        HashMap<String,Integer> h1=new HashMap<>();
        for(int i=0;i<n;i++){
            ans.append('0');
        }
        cur.append(ans);
        h1.put(cur.toString(),1);
        dfs(cur,ans,h1,k);
        return ans.toString();
    }
    static void dfs(StringBuilder cur,StringBuilder ans,HashMap<String,Integer> h1,int k){
        StringBuilder temp;
        for(int i=k-1;i>=0;i--){
            temp=new StringBuilder(cur.substring(1));
            temp.append((char)(i+'0'));
            if(!h1.containsKey(temp.toString())){
                h1.put(temp.toString(),1);
                ans.append((char)(i+'0'));
                dfs(temp,ans,h1,k);
                return ;
            }
        }
    }
    public static void main(String[] args) {
        int N = 2, K = 2;
        System.out.println(findString(N,K));
    }
}
