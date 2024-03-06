import java.util.*;
public class Main {
    public static ArrayList<Integer> search(String pattern, String text) {
        ArrayList<Integer> ans=new ArrayList<>();
        int idx = text.indexOf(pattern);
        while (idx!=-1){
            ans.add(idx+1);
            idx = text.indexOf(pattern,idx+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String text = "birthdayboy" ,pattern = "birth";
        System.out.println(search(pattern,text));
    }
}