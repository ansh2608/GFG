public class Main {
    public static void threeWayPartition(int[] array, int a, int b) {
        int i=0,j=0;
        while(i<array.length) {
            if(array[i]<a) {
                int temp =array[i];
                array[i]=array[j];
                array[j]=temp;
                j++;
            }
            i++;
        }
        i=0;
        while(i<array.length) {
            if(array[i]>=a&&array[i]<=b) {
                int temp1=array[i];
                array[i]=array[j];
                array[j]=temp1;
                j++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4};
        int a=1,b=2;
        threeWayPartition(array,a,b);
    }
}