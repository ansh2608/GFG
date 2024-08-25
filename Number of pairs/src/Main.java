public class Main {
    public long countPairs(int[] x, int[] y, int m, int n) {
        int suffix[]=new int[1002];
        long ans=0;
        for(int i=0;i<n;i++) suffix[y[i]]++;
        for(int i=1000;i>=3;i--) suffix[i]=suffix[i]+suffix[i+1];
        for(int i=0;i<m;i++){
            if(x[i]==1) continue;
            else if(x[i]==2) ans+=suffix[1]+suffix[5];
            else if(x[i]==3) ans+=suffix[1]+suffix[2]+suffix[4];
            else ans+=suffix[1]+suffix[x[i]+1];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}