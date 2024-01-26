import java.util.*;
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class itemComparator implements Comparator<Item> {
    public int compare(Item a,Item b){
        double r1=(double)(a.value)/(double)(a.weight);
        double r2=(double)(b.value)/(double)(b.weight);
        if(r1<r2) return 1;
        else if(r1>r2) return -1;
        else return 0;
    }
}
class Solution {
    double fractionalKnapsack(int w, Item arr[], int n) {
        Arrays.sort(arr,new itemComparator());
        double ans=0;
        for(int i=0;i<n;i++){
            if(w>=arr[i].weight){
                ans+=arr[i].value;
                w-=arr[i].weight;
            }
            else{
                ans+=((double)arr[i].value/(double)arr[i].weight)*(double)w;
                break;
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
    }
}