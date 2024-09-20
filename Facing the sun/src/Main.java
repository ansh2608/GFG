public class Main {
    public int countBuildings(int[] height) {
        if(height.length == 0) return 0;
        int count=1;
        int  max_height = height[0];
        for(int i=0;i<height.length;i++){
            if(height[i]>max_height){
                count++;
                max_height=height[i];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}