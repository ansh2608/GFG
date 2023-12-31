import java.util.HashMap;

public class Better_Approach {
    public static int maxLengthBetweenEqualCharacters(String s){
        HashMap<Character,Integer> mp=new HashMap<>();
        int maxSub=-1;
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (mp.containsKey(ch)) maxSub=Math.max(maxSub,i-mp.get(ch)-1);
            else mp.put(ch,i);
        }
        return maxSub;
    }
    public static void main(String[] args) {
        String s = "ojdncpvyneq";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
