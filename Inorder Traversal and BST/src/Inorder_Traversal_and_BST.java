public class Inorder_Traversal_and_BST {
    static int isRepresentingBST(int arr[], int N){
        for(int i=1; i<N;i++){
            if(arr[i]<=arr[i-1]){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int N = 3;
        int[] arr = {2, 4, 5};
        System.out.println(isRepresentingBST(arr,N));
    }
}
