import java.util.*;
class Solution{
    class Pair{
        String first;
        int second;
        public Pair(String first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public void seive(boolean[]arr){
        int n = arr.length;
        for(int i=2;i<Math.sqrt(n);i++){
            for(int j=2*i;j<n;j=j+i){
                if(!arr[j]) arr[j]=true;
            }
        }
    }
    int solve(int Num1,int Num2){
        if(Num1==Num2)return 0;
        HashSet<String> set = new HashSet<>();
        boolean[]Nprime=new boolean[10000];
        seive(Nprime);
        for(int i=1000;i<10000;i++) if(!Nprime[i])set.add(Integer.toString(i));
        String start=Integer.toString(Num1);
        String end=Integer.toString(Num2);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,1));
        set.remove(start);
        while(!q.isEmpty()){
            String word = q.peek().first;
            int step = q.peek().second;
            q.remove();
            if(word.equals(end)) return step-1;
            for(int i=0;i<word.length();i++){
                for(char ch='0';ch<='9';ch++){
                    char[]rc = word.toCharArray();
                    rc[i]=ch;
                    String rw= new String(rc);
                    if(set.contains(rw)){
                        set.remove(rw);
                        q.add(new Pair(rw,step+1));
                    }
                }
            }
        }
        return 0;
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}