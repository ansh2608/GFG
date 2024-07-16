public class Main {
    public String printString(String s, char ch, int count) {
        int n = s.length(), lindex = 0, k = 0;
        for(int i=0;i<n;i++) {
            if(s.charAt(i) == ch){
                k++;
                if(k == count ){
                    lindex = i;
                    break;
                }
            }
        }
        if(k != count) return("");
        String str = "";
        for(int i=lindex+1 ;i<n;i++) str += s.charAt(i);
        return str;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}