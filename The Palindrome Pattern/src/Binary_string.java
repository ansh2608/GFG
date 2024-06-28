public class Binary_string {
    public static int OperationsBinaryString(String s) {
        int ans = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i += 2) {
            char operation = s.charAt(i);
            int nextValue = s.charAt(i + 1) - '0';
            if (operation == 'A') ans = ans & nextValue;
            else if (operation == 'B') ans = ans | nextValue;
            else if (operation == 'C') ans = ans ^ nextValue;
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        System.out.println(OperationsBinaryString(s));  // Output should be 1
    }
}
