public class Main {
    int lps(String str) {
        int n= str.length();
        int i=0, k=0, j=1, c=0;
        while(i<n && j<n){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j++;
                c++;
            }
            else{
                i=0;
                k++;
                j=k;
                c=0;
            }

        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}