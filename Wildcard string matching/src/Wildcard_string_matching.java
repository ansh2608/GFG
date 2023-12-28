public class Wildcard_string_matching {
    static boolean match(String wild, String pattern) {
        int n=wild.length();
        int m=pattern.length();
        return go(n,m,wild,pattern);
    }
    static boolean go(int n, int m, String w, String p){
        if(m==0&& n==0) return true;
        else if(m==0 || n==0) return false;
        if(w.charAt(n-1)==p.charAt(m-1)||w.charAt(n-1)=='?') return go(n-1,m-1,w,p);
        else if(w.charAt(n-1)=='*') return go(n-1,m-1,w,p) || go(n,m-1,w,p);
        else return false;
    }
    public static void main(String[] args) {
        String wild = "ge*ks";
        String pattern = "geeks";
        System.out.println(match(wild,pattern));
    }
}
