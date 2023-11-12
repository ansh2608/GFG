public class Check_String_rotated_by_two_places {
    public static boolean isRotated(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        String cR = str1.substring(2) + str1.substring(0, 2);
        if (cR.equals(str2)) return true;
        String acR = str1.substring(str1.length() - 2) + str1.substring(0, str1.length() - 2);
        return acR.equals(str2);
    }
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "geeksgeeksfor";
        if (isRotated(a,b)) System.out.println(1);
        else System.out.println(0);
    }
}
