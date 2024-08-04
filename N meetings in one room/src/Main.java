import java.util.*;
public class Main {
    public static int maxMeetings(int n, int[] start, int[] end) {
        int[][] meet = new int[n][2];
        for(int i=0; i<n; i++) {
            meet[i][0] = start[i];
            meet[i][1] = end[i];
        }
        Arrays.sort(meet, Comparator.comparingInt(o -> o[1]));
        int count = 1;
        int st = meet[0][0];
        int et = meet[0][1];
        for(int i=1; i<n; i++) {
            if(meet[i][0]>et) {
                st = meet[i][0];
                et = meet[i][1];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5}, end =  {2, 4, 6, 7, 9, 9};
        int n=6;
        System.out.println(maxMeetings(n,start,end));
    }
}