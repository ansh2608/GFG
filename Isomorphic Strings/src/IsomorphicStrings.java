public class IsomorphicStrings {
    public static boolean areIsomorphic(String str1,String str2) {
        int n1=str1.length();
        int n2=str2.length();
        if (n1!=n2) return false;
        int[] a=new int[128];
        int[] b=new int[128];
        for (int i=0;i<n1;i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);
            if (a[c1]!=b[c2]) return false;
            a[c1]=i+1;
            b[c2]=i+1;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xxx";
        if (areIsomorphic(str1,str2)) System.out.println(1);
        else System.out.println(0);
    }
}
