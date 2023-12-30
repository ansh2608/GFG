import java.util.HashMap;

public class Winner_of_an_election {
    public static String[] winner(String[] arr, int n) {
        HashMap<String,Integer> map=new HashMap<>();
        for (String str:arr){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        String name = arr[0];
        int maxCount = map.get(arr[0]);
        for(int i=1;i<n;i++){
            if(maxCount <= map.get(arr[i]) ){
                if(maxCount == map.get(arr[i])){
                    if (arr[i].compareTo(name) < 0){
                        maxCount = map.get(arr[i]);
                        name = arr[i];
                    }
                } else{
                    maxCount = map.get(arr[i]);
                    name = arr[i];
                }

            }
        }
        String[] res = new String[2];
        res[0] = name;
        res[1] = String.valueOf(maxCount);
        return res;
    }
    public static void main(String[] args) {
        String[] arr = {"john","johnny","jackie","johnny","john","jackie","jamie","jamie","john","johnny","jamie","johnny","john"};
        String[] ans=winner(arr,arr.length);
        for (String str:ans) System.out.print(str+" ");
    }
}
