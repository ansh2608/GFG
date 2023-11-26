import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Solution{
    ArrayList<Integer> l = new ArrayList<>();
    public List<Integer> pattern(int N){
        // code here
        int com = fun(N,l);
        fun2(com,N,l);
        return l;
    }
    
    int fun(int val, List<Integer> l){
        if(val<=0){
            return val;
        }
        l.add(val);
        return fun(val-5, l);
    }
    void fun2(int val, int N, List<Integer> l){
        if(val>N) return ;
        l.add(val);
        fun2(val+5, N, l);
    }
   
}