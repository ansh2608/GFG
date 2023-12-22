import java.util.*;
public class Maximum_Meetings {
    static class Pair implements Comparable<Pair> {
        int startTime, finishTime, index;
        Pair(int startTime, int finishTime, int index) {
            this.startTime = startTime;
            this.finishTime = finishTime;
            this.index = index;
        }
        public int compareTo(Pair other) {
            if(this.finishTime - other.finishTime == 0) {
                return this.startTime - other.startTime;
            }
            return this.finishTime - other.finishTime;
        }
    }
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        Pair[] pairs = new Pair[S.length];
        for (int i = 0; i < pairs.length; i++) {
            pairs[i] = new Pair(S[i], F[i], i + 1);
        }
        Arrays.sort(pairs);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(pairs[0].index);
        int finish = pairs[0].finishTime;
        for(int i = 1; i < N; i++) {
            if(pairs[i].startTime > finish) {
                answer.add(pairs[i].index);
                finish = pairs[i].finishTime;
            }
        }
        Collections.sort(answer);
        return answer;
    }
    public static void main(String[] args) {
        int N = 6;
        int[] S = {1,3,0,5,8,5};
        int[] F = {2,4,6,7,9,9};
        ArrayList<Integer> ans=maxMeetings(N,S,F);
        System.out.println(ans);
    }
}
