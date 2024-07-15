public class Main {
    public static String smallestNumber(int s, int d) {
        if (d * 9 < s) return "-1";
        int n = (int)Math.pow(10, d - 1);
        int sum = s - 1;
        char[] temp = Integer.toString(n).toCharArray();
        int i = d - 1;
        while (i >= 0 && sum > 0) {
            if (sum > 9) {
                temp[i] = '9';
                sum = sum - 9;
            } else {
                int val = temp[i] - '0';
                val = val + sum;
                temp[i] = (char)((int)'0' + val);
                sum = 0;
            }
            i--;
        }
        return new String(temp);
    }
    public static void main(String[] args) {
        int s = 9, d = 2;
        System.out.println(smallestNumber(s,d));
    }
}