public class Check_if_strings_are_rotations {
    public static boolean areRotations(String s1, String s2 ) {
        String ans=s2+s2;
        return ans.contains(s1);
    }
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="forgeeksgeeks";
        System.out.println(areRotations(str1,str2));
    }
}
