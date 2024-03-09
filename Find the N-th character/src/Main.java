public class Main {
    public static char nthCharacter(String s, int r, int n){
        for(int i=0;i<r;++i){
            StringBuilder curr =new StringBuilder();
            for(char ch : s.toCharArray()){
                if(ch=='0') curr.append("01");
                else curr.append("10");
                if(curr.length()>s.length())
                    break;
            }
            s=curr.toString();
        }
        return s.charAt(n);
    }
    public static void main(String[] args) {
        String s = "1100";
        int r = 2 ,n = 3;
        System.out.println(nthCharacter(s,r,n));
    }
}